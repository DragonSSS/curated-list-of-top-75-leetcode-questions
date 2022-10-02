package leetcode.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class NetworkDelayTime {
    // 1,2,3,...n
    // time[]: 0 - start 1 - end 2 - time
    // Dijkstra Algorithm
    public int networkDelayTime(int[][] times, int n, int k) {
        Set<Integer> visited = new HashSet<>();
        // boolean[] visited = new boolean[n + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, k});
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        // build graph with time weight
        for(int[] time : times) {
            int start = time[0];
            int end = time[1];
            int cost = time[2];
            
            graph.putIfAbsent(start, new ArrayList<>());
            graph.get(start).add(new int[]{end, cost});
        }
        
        // pq loop
        int res = 0;
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curNode = cur[1];
            int curCost = cur[0];
            if (visited.contains(curNode))
                continue;
            visited.add(curNode);
            res = curCost;
            if (!graph.containsKey(curNode))
                continue;
            for(int[] next : graph.get(curNode)) {
                if (visited.contains(next[0]))
                    continue;
                pq.offer(new int[]{curCost + next[1], next[0]});
            }
        }
        
        return  visited.size() == n? res : - 1;
    }

    // dijsktra algorithm
    // build the graph by Map<Integer, List<int[]>>
    // minHeap<int[]> pq store int[]{cost, node}
    // Set<Integer> visited
    public int networkDelayTime_2r(int[][] times, int n, int k) {
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        // build graph
        for(int[] time : times) {
            int source = time[0];
            int target = time[1];
            int cost = time [2];
            
            graph.putIfAbsent(source, new ArrayList<>());
            graph.get(source).add(new int[]{target, cost});
        }
        
        pq.offer(new int[]{0, k});
        int res = 0;
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curCost = cur[0];
            int curNode = cur[1];
            if (visited.contains(curNode))
                continue;
            visited.add(curNode);
            res = curCost;
            
            if (graph.containsKey(curNode)) {
                for(int[] next : graph.get(curNode)) {
                    int nextNode = next[0];
                    int addCost = next[1];
                    if (visited.contains(nextNode))
                        continue;
                    pq.offer(new int[]{curCost + addCost, nextNode});
                }
            }
        }
        return visited.size() == n ? res : -1;
    }
}
