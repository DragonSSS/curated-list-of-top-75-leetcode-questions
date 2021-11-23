package leetcode.dfs;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CriticalConnectionsInNetwork {
    // Tarjan's algorithm
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // build graph first
        buildGraph(n, connections, graph);

        boolean[] visited = new boolean[n];
        int[] visitedTimes = new int[n];
        int[] lowTimes = new int[n];
        int time = 0;

        helper(graph, 0, -1, visitedTimes, lowTimes, time, visited, res);

        return res;
    }

    // dfs
    private void helper(Map<Integer, List<Integer>> graph, int curNode, int preNode, int[] visitedTimes, int[] lowTimes, int time, boolean[] visited, List<List<Integer>> res) {
        visited[curNode] = true;
        visitedTimes[curNode] = lowTimes[curNode] = time++;
        
        for (int neighbor : graph.get(curNode)) {
            if (neighbor == preNode)
                continue;
            if (!visited[neighbor]) {
                helper(graph, neighbor, curNode, visitedTimes, lowTimes, time, visited, res);
                lowTimes[curNode] = Math.min(lowTimes[curNode], lowTimes[neighbor]);
                if (visitedTimes[curNode] < lowTimes[neighbor]) {
                    res.add(Arrays.asList(curNode, neighbor));
                }
            } else {
                lowTimes[curNode] = Math.min(lowTimes[curNode], visitedTimes[neighbor]);
            }
        }
    }

    private void buildGraph(int n, List<List<Integer>> connections, Map<Integer, List<Integer>> graph) {
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (List<Integer> connection : connections) {
            int start = connection.get(0);
            int end = connection.get(1);
            graph.get(start).add(end);
            graph.get(end).add(start);
        }
    }
}
