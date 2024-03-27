package leetcode.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MinimumFuelCostToReportToCapital {
    // bfs
    public long minimumFuelCost(int[][] roads, int seats) {
        // build graph and indegree array
        // bfs to calculate fuel
        int size = roads.length + 1;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[size];
        int[] indegree = new int[size];
        for(int[] road : roads) {
            int from = road[0];
            int to = road[1];
            graph.putIfAbsent(from, new ArrayList<>());
            graph.putIfAbsent(to, new ArrayList<>());
            graph.get(from).add(to);
            graph.get(to).add(from);
            indegree[from]++;
            indegree[to]++;
        }

        int[] representatives = new int[size];
        Arrays.fill(representatives, 1);
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i < size; i++) {
            if(indegree[i] == 1) {
                queue.offer(i);
                visited[i] = true;
            }
        }

        long res = 0;
        while(!queue.isEmpty()) {
            int n = queue.size();
            for(int i = 0; i < n; i++) {
                int cur = queue.poll();
                res += Math.ceil(1.0 * representatives[cur] / seats);

                for(int next : graph.get(cur)) {
                    if(!visited[next] && next != 0) {
                        representatives[next] += representatives[cur];
                        indegree[cur]--;
                        indegree[next]--;
                        if(indegree[next] == 1 && !visited[next]) {
                            queue.offer(next);
                            visited[next] = true;
                        }
                    }
                }
            }
        }
        return res;
    }
    
    // dfs
    Map<Integer, List<Integer>> graph = new HashMap<>();
    int numSeats;
    long res = 0;
    public long minimumFuelCost_dfs(int[][] roads, int seats) {
        if (roads.length == 0) {
            return 0;
        }
        numSeats = seats;
        for(int[] road : roads) {
            int from = road[0];
            int to = road[1];
            graph.putIfAbsent(from, new ArrayList<>());
            graph.putIfAbsent(to, new ArrayList<>());
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        helper(-1, 0);
        return res;
    }

    private long helper(int parent, int cur) {
        int ppl = 1;
        for(int next : graph.get(cur)) {
            if (next == parent) {
                continue;
            }
            ppl += helper(cur, next);
        }
        if (cur != 0) {
            res += Math.ceil(1.0 * ppl / numSeats);
        }
        return ppl;
    }
}
