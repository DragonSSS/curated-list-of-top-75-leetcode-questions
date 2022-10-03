package leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class CheapestFlightsWithinKStops {
    int res = Integer.MAX_VALUE;
    public int findCheapestPrice_dijkstra(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();

        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int cost = flight[2];
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(new int[]{to, cost});
        }

        boolean[][] visited = new boolean[n][k + 2];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        queue.offer(new int[]{0, src, k + 1});

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curCost = cur[0];
            int curStop = cur[1];
            int curCount = cur[2];

            if (curStop == dst) {
                return curCost;
            }

            if (visited[curStop][curCount]) {
                continue;
            }
            visited[curStop][curCount] = true;

            if (curCount <= 0) {
                continue;
            }

            if (graph.containsKey(curStop)) {
                for(int[] next : graph.get(curStop)) {
                    queue.offer(new int[]{curCost + next[1], next[0], curCount - 1});
                }
            }
        }
        return -1;
    }

    public int findCheapestPrice_bfs_tle(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();

        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int cost = flight[2];
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(new int[]{to, cost});
        }

        // store the stop and current 
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src, 0});
        int count = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int curStop = cur[0];
                int curCost = cur[1];

                if (curStop == dst) {
                    res = Math.min(res, curCost);
                }

                if (graph.containsKey(curStop)) {
                    for (int[] next : graph.get(curStop)) {
                        if (res > next[1] + curCost) {
                            queue.offer(new int[]{next[0], curCost + next[1]});
                        }
                    }
                }
            }

            if (count++ > k) {
                break;
            }
        }

       return res == Integer.MAX_VALUE? -1 : res;
    }

    public int findCheapestPrice_dfs_tle(int n, int[][] flights, int src, int dst, int k) {
        boolean[] visited = new boolean[n];
        Map<Integer, List<int[]>> graph = new HashMap<>();

        // flight[] = [from, to, cost];
        // build graph
        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int cost = flight[2];
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(new int[]{to, cost});
        }

        visited[src] = true;
        helper(graph, visited, src, dst, 0, k + 1);

        return res == Integer.MAX_VALUE? -1 : res;
    }

    private void helper(Map<Integer, List<int[]>> graph, boolean[] visited, int src, int dst, int cost, int k) {
        if (k < 0) {
            return;
        }

        if (src == dst) {
            res = Math.min(res, cost);
            return;
        }

        if (graph.containsKey(src)) {
            for (int[] next : graph.get(src)) {
                if(!visited[next[0]] && cost + next[1] < res) {
                    visited[next[0]] = true;
                    helper(graph, visited, next[0], dst, cost + next[1], k - 1);
                    visited[next[0]] = false; // backtracking
                }
            }
        }
    }

    public int findCheapestPrice_2r(int n, int[][] flights, int src, int dst, int k) {
        boolean[][] visited = new boolean[n][k + 2];
        Map<Integer, List<int[]>> graph = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, src, k + 1});
        
        // build graph
        for(int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int cost = flight[2];
            
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(new int[]{to, cost});
        }
        
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curCost = cur[0];
            int curCity = cur[1];
            int curCount = cur[2];
            
            if(curCity == dst)
                return curCost;
            
            if(visited[curCity][curCount])
                continue;
            
            visited[curCity][curCount] = true;
            
            if (curCount <= 0)
                continue;
  
            if(!graph.containsKey(curCity))
                continue;
            
            for(int[] next : graph.get(curCity)) {
                pq.offer(new int[]{curCost + next[1], next[0], curCount - 1});
            }
        }
        
        return -1;
    }
    // dijkstra algorithm
    // build graph Map<Integer, List<Integer>>
    // miniHeap int[]{cost, citry, stop}
    // boolean visited[][] - [city, stop]
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] visited = new boolean[n][k + 2];
        pq.offer(new int[]{0, src, k + 1});
        
        // build graph
        for (int[] flight : flights) {
            int start = flight[0];
            int end = flight[1];
            int cost = flight[2];
            
            graph.putIfAbsent(start, new ArrayList<>());
            graph.get(start).add(new int[]{end, cost});
        }
        
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curCost = cur[0];
            int curCity = cur[1];
            int curStop = cur[2];
            
            if (curCity == dst)
                return curCost;
            
            if (curStop <= 0)
                continue;
            
            if (visited[curCity][curStop])
                continue;
            
            visited[curCity][curStop] = true;
            
            if (graph.containsKey(curCity)) {
                for(int[] next : graph.get(curCity)) {
                    int nextCity = next[0];
                    int nextCost = next[1];
                    pq.offer(new int[] {curCost + nextCost, nextCity, curStop - 1});
                }
            }
            
        }
        return -1;
    }
}
