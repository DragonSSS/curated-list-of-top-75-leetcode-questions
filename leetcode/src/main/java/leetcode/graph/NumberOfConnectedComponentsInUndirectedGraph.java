package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class NumberOfConnectedComponentsInUndirectedGraph {
    public int countComponents(int n, int[][] edges) {

        if (n == 0 || edges == null || edges.length == 0)
            return 0;

        if (n == 1)
            return n;

        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                count++;
                queue.offer(i);

                while (!queue.isEmpty()) {
                    int cur = queue.poll();
                    visited.add(cur);

                    for(int next : graph.get(cur)) {
                        if (!visited.contains(next)) {
                            queue.offer(next);
                        }
                    }
                }
            }
        }

        return  count;
    }

    // 2rd round
    // dfs or bfs
    // undirected graph
    boolean[] visited;
    Map<Integer, List<Integer>> graph = new HashMap<>();
    public int countComponents_2r_dfs(int n, int[][] edges) {
        visited = new boolean[n];
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        for(int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                helper(i);
                count++;
            }
        }
        
        return count;
    }
    
    private void helper(int node) {
        visited[node] = true;
        
        for(int next : graph.get(node)) {
            if(!visited[next]) {
                helper(next);
            }
        }
    }

    Set<Integer> visited_3r = new HashSet<>();
    Map<Integer, List<Integer>> graph_3r = new HashMap<>();
    public int countComponents_3r(int n, int[][] edges) {
        // build graph
        for(int i = 0; i < n; i++) {
            graph_3r.put(i, new ArrayList<>());
        }
        
        for(int[] edge : edges) {
            int start = edge[0];
            int end = edge[1];
            graph_3r.get(start).add(end);
            graph_3r.get(end).add(start);
        }
        
        int res = 0;
        for(int i = 0; i < n; i++) {
            if(!visited_3r.contains(i)) {
                res++;
                helper_3r(i);
            }
        }
        
        return res;
    }
    
    private void helper_3r(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(index);
        visited_3r.add(index);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();

                for(int next : graph_3r.get(cur)) {
                    if(visited_3r.contains(next))
                        continue;
                    queue.offer(next);
                    visited_3r.add(next);
                }
            }
        }
    }
}
