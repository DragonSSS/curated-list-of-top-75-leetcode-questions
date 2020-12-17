package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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
}
