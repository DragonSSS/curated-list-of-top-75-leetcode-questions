package leetcode.dfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // build graph based on equations
        Map<String, Map<String, Double>> graph = new HashMap<>();
        buildGraph(equations, values, graph);
        double[] res = new double[queries.size()];
        // loop queries to get each result via dfs recursion
        for (int i = 0; i < queries.size(); i++) {
            res[i] = findQueryResult(graph, queries.get(i).get(0), queries.get(i).get(1), new HashSet<>());
        }
        return res;
    }

    private double findQueryResult(Map<String, Map<String, Double>> graph, String start, String end, Set<String> visited) {
        if (!graph.containsKey(start)) {
            return -1.0;
        }

        if (graph.get(start).containsKey(end)) {
            return graph.get(start).get(end);
        }

        visited.add(start);
        for (Map.Entry<String, Double> next : graph.get(start).entrySet()) {
            if (!visited.contains(next.getKey())) {
                double res = findQueryResult(graph, next.getKey(), end, visited);
                if (res != -1.0) {
                    return res * next.getValue();
                }
            }
        }

        return -1.0;
    }

    private void buildGraph(List<List<String>> equations, double[] values, Map<String, Map<String, Double>> graph) {
        for (int i = 0; i < equations.size(); i++) {
            String start = equations.get(i).get(0);
            String end = equations.get(i).get(1);
            Double val = values[i];
            graph.putIfAbsent(start, new HashMap<>());
            graph.putIfAbsent(end, new HashMap<>());
            graph.get(start).put(end, val);
            graph.get(end).put(start, 1.0 / val); // val cannot be zero based on question description
        }
    }
}
