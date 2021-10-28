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
}
