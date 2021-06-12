package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumTimeToCollectAllApplesInTree {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
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

        int res = 0;
        // dfs
        res = helper(0, graph, visited, hasApple);

        return res;
    }

    private int helper(int node, Map<Integer, List<Integer>> graph, boolean[] visited, List<Boolean> hasApple) {
        visited[node] = true;

        int res = 0;

        for(int next : graph.get(node)) {
            if(visited[next]) continue;
            res += helper(next, graph, visited, hasApple);
        }

        if (node != 0 && (res > 0 || hasApple.get(node))) {
            res += 2;
        }

        return res;
    }
}
