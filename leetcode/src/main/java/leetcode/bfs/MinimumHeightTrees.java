package leetcode.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1)
            return Collections.singletonList(0);

        // build graph
        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (graph.get(i).size() == 1)
                leaves.add(i);
        }

        while( n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int i : leaves) {
                int j = graph.get(i).iterator().next();
                graph.get(j).remove(i);
                if (graph.get(j).size() == 1)
                    newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;
    }

    // Thinking about if we have single path here
    // to find the mini height tree, we will have two pointers from each end, move them with same speed until
    // they meet. middle node(s) is the root we want

    // It is similar to BFS topolical sort, remove the leaves, iterate level by level,
    // remove new leaves if out-degree is 1
    // until 1 or 2 node(s) left
    
    public List<Integer> findMinHeightTrees_2r(int n, int[][] edges) {
        if (n == 1) {
            return Arrays.asList(0);
        }
        Map<Integer, Set<Integer>> graph = new HashMap<>();

        for(int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }

        for(int[] edge : edges) {
            int from = edge[0];
            int to = edge [1];
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        List<Integer> leaves = new ArrayList<>();
        for(int key : graph.keySet()){
            if(graph.get(key).size() == 1) {
                leaves.add(key);
            }
        }

        while( n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for(int i : leaves) {
                int j = graph.get(i).iterator().next();
                graph.get(j).remove(i);
                if (graph.get(j).size() == 1) {
                    newLeaves.add(j);
                }
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}
