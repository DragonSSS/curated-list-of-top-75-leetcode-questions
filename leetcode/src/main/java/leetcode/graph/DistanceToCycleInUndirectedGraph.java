package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class DistanceToCycleInUndirectedGraph {
    public int[] distanceToCycle(int n, int[][] edges) {
        Set<Integer> cycle = new HashSet<>();
        boolean[] visited = new boolean[n];
         Map<Integer, List<Integer>> graph = new HashMap<>();

         // build graph
         for(int i = 0; i < n; i++) {
             graph.put(i, new ArrayList<>());
         }

         for(int[] edge : edges) {
             graph.get(edge[0]).add(edge[1]);
             graph.get(edge[1]).add(edge[0]);
         }

         findCycle(0, -1, cycle, graph, visited);

         int[] res = new int[n];
         Queue<Integer> queue = new LinkedList<>();
         for(int i = 0; i < n; i++) {
             if (cycle.contains(i)) {
                 queue.offer(i);
             }
         }
 
         int des = 0;
         while(!queue.isEmpty()) {
             int size = queue.size();
             for(int i = 0; i < size; i++) {
                 int cur = queue.poll();
                 if (res[cur] == 0 && !cycle.contains(cur)) {
                     res[cur] = des;
                 }
                 for(int next : graph.get(cur)) {
                     if(!cycle.contains(next) && res[next] == 0) {
                         queue.offer(next);
                     }
                 }
             }
             des++;
         }
         return res;
    }

    private int findCycle(int cur, int parent, Set<Integer> cycle, Map<Integer, List<Integer>> graph, boolean[] visited) {
        if (visited[cur]) {
            return cur;
        }

        visited[cur] = true;
        for(int next : graph.get(cur)) {
            if (next == parent) {
                continue;
            }
            int node = findCycle(next, cur, cycle, graph, visited);
            if (node > -1) {
                cycle.add(cur);
            }
            if (node != -1) {
                // check if cycle end
                return cur == node ? -2 : node;
            }
        }
        return -1;
    }    
}
