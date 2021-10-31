package leetcode.graph;

import java.util.*;

public class AlienDictionary {
    // Kahn's algorithm or dfs approach
    public String alienOrder(String[] words) {
        if (words == null || words.length == 0)
            return "";

        int[] indegree = new int[26];
        Map<Character, List<Character>> graph = new HashMap<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new ArrayList<>());
            }
        }

        //build graph
        for (int i = 1; i < words.length; i++) {
            String first = words[i - 1];
            String second = words[i];

            // make sure it is valid lexicographical order, otherwise return empty string. e.g.
            // ["abc", "ab"]
            if ( first.length() > second.length() && first.startsWith(second))
            return "";

            char[] arrFirst = first.toCharArray();
            char[] arrSecond = second.toCharArray();

            int len = Math.min(arrFirst.length, arrSecond.length);

            for (int j = 0; j < len; j++) {
                if (arrFirst[j] != arrSecond[j]) {
                    if (!graph.get(arrFirst[j]).contains(arrSecond[j])) {
                        graph.get(arrFirst[j]).add(arrSecond[j]);
                        indegree[arrSecond[j] - 'a']++;
                    }
                    break;
                }
            }
        }

        // make sure it is DAG. e.g.
        // ["z","x","a","zb","zx"]
        // z -> x - > a -> z
        // b -> x
        boolean[] visited = new boolean[26];
        for (char c : graph.keySet()) {
            if (isCircle(graph, visited, c))
                return "";
        }

        //bfs using queue
        Queue<Character> queue = new LinkedList<>();
        for (char c : graph.keySet()) {
            if (indegree[c - 'a'] == 0) {
                queue.offer(c);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!queue.isEmpty()) {
            char current = queue.poll();
            res.append(current);

            for (char c : graph.get(current)) {
                indegree[c - 'a']--;
                if (indegree[c - 'a'] == 0) {
                    queue.offer(c);
                }
            }
        }

        return res.toString();
    }

    private boolean isCircle(Map<Character, List<Character>> graph, boolean[] visited, char c) {
        if (visited[c - 'a']) {
            return true;
        }
        visited[c - 'a'] = true;
        for (char next : graph.get(c)) {
            if (isCircle(graph, visited, next))
                return true;
        }
        visited[c - 'a'] = false;
        return false;
    }
}
