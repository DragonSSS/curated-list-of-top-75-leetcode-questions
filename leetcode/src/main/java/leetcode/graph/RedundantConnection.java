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
    // union find
    // union func -> check if two nodes has same parent, set parent between them
    // find func -> find the parent of current node
    int[] parents;
    public int[] findRedundantConnection_2r(int[][] edges) {
        int n = edges.length;
        parents = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            parents[i] = i;
        }
        
        for(int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            if(!union(node1, node2))
                return edge;
        }
        return new int[]{-1, -1};
    }
    
    private boolean union(int node1, int node2) {
        int parent1 = find(node1);
        int parent2 = find(node2);
        if(parent1 == parent2)
            return false;
        
        parents[parent1] = parent2;
        return true;
    }
    
    private int find(int node) {
        // if (node != parents[node]) {
        //     return find(parents[node]);
        // }
        // return parents[node];
        while(node != parents[node]) {
            parents[node] = parents[parents[node]];
            node = parents[node];
        }
        
        return parents[node];
    }
}
