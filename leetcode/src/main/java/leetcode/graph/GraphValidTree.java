package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphValidTree {
    // detect circle in graph
    // dfs check all nodes visited
    public boolean validTree(int n, int[][] edges) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }

        boolean[] visited = new boolean[n];

        for(int i = 0; i < edges.length; i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        if (!helper(-1, 0, graph, visited))
            return false;

        for(boolean v : visited) {
            if (!v)
                return false;
        }

        return true;
    }

    private boolean helper(int pre, int cur, Map<Integer, ArrayList<Integer>> graph, boolean[] visited) {
        if(visited[cur])
            return false;

        visited[cur] = true;

        for(int next : graph.get(cur)) {
            if(next != pre && !helper(cur, next, graph, visited))
                return false;
        }

        return true;
    }

    public boolean validTreeBFS(int n, int[][] edges) {

        Set<Integer> visit = new HashSet<>();
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            visit.add(cur);

            for (int next : graph.get(cur)) {
                if (queue.contains(next)) {
                    return false;
                }
                if (!visit.contains(next)) {
                    queue.offer(next);
                }

            }
        }

        return visit.size() == n;
    }
}
