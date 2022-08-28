package leetcode.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RedundantConnection {
    // Set<Integer> visited to track which node is already visited
    // build undirected graph based on edge
    // iterate each edge recursively, before add the edge into graph, check if two node is already connected, so we know this edge is redundant one, return it
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    public int[] findRedundantConnection(int[][] edges) {
        // initialize graph
        for(int i = 1; i<= edges.length; i++) {
            graph.put(i, new HashSet<>());
        }
        
        for(int[] edge : edges) {
            if (helper(edge[0], edge[1], new HashSet<>())) {
                return edge;
            }
            // trick is to run helper func before adding current edge into graph
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        return new int[]{-1, -1};
    }
    
    
    private boolean helper(int start, int target, Set<Integer> visited) {
        if (start == target)
            return true;
        
        if (visited.contains(start))
            return false;
        
        visited.add(start);
        for(int next : graph.get(start)) {
            if (helper(next, target, visited))
                return true;
        }
        return false;
    }    
}
