package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

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

    Map<Character, List<Character>> graph = new HashMap<>();
    int[] indegree = new int[26];
    public String alienOrder_2r(String[] words) {        
        for(String word : words) {
            for(char c : word.toCharArray()) {
                graph.putIfAbsent(c, new ArrayList<>());
            }
        }
        
        // build graph
        for(int i = 1; i < words.length; i++) {
            String word1 = words[i - 1];
            String word2 = words[i];
            
            int minLen = Math.min(word1.length(), word2.length());
            // invalid case
            if(word1.length() > word2.length() && word1.startsWith(word2))
                return "";
            
            for(int j = 0; j < minLen; j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);
                if(c1 != c2) {
                    if (!graph.get(c1).contains(c2)) {
                        graph.get(c1).add(c2);
                        indegree[c2 - 'a']++;
                    }
                    break;
                }
            }
        }

        // check DAG, make sure there is no circle
        for(char c : graph.keySet()) {
            if(circleExist_2r(c, new HashSet<>())) {
                return "";
            }
        }
        
        StringBuilder sb = new StringBuilder();
        // bfs
        Queue<Character> queue = new LinkedList<>();
        for(char c : graph.keySet()) {
            if(indegree[c - 'a'] == 0) {
                queue.offer(c);
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                char cur = queue.poll();
                sb.append(cur);
                for(char next : graph.get(cur)) {
                    indegree[next - 'a']--;
                    if (indegree[next - 'a'] == 0) {
                        queue.offer(next);
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    // dfs + backtracking
    private boolean circleExist_2r(char c, Set<Character> visited)
    {
        if(visited.contains(c))
            return true;
        
        visited.add(c);
        for(char next : graph.get(c)) {
            if(circleExist_2r(next, visited))
                return true;
        }
        visited.remove(c);
        return false;
    }

    // words = ["wrt","wrf","er","ett","rftt"]
    // t -> f
    // w -> e
    // r -> t
    // e -> r
    
    // wertf
    
    // if there is circle, it is invalid
    // s  t
    // s should be short than t
    // time complexity O(C)
    Map<Character, List<Character>> graph_3r = new HashMap<>();
    int[] indegree_3r = new int[26];
    public String alienOrder_3r(String[] words) {
        for(String word : words) {
            for (char c : word.toCharArray()) {
                graph_3r.putIfAbsent(c, new ArrayList<>());
            }
        }
        
        for(int i = 1; i < words.length; i++) {
            String first = words[i - 1];
            String second = words[i];
            
            if (first.length() > second.length() && first.startsWith(second)) {
                return "";
            }
            
            for(int j = 0; j < Math.min(first.length(), second.length()); j++) {
                if (first.charAt(j) != second.charAt(j)) {
                    graph_3r.get(first.charAt(j)).add(second.charAt(j));
                    indegree_3r[second.charAt(j) - 'a']++;
                    break;
                }
            }
        }
        
        // detect circle
        boolean[] visited = new boolean[26];
        for(char c : graph_3r.keySet()) {
            if (helper_3r(c, visited))
                return "";
        }
        
        
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        for(char c : graph_3r.keySet()) {
            if(indegree_3r[c - 'a'] == 0) {
                queue.offer(c);
                seen.add(c);
                sb.append(c);
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                char cur = queue.poll();
                for(char next : graph_3r.get(cur)) {
                    if (seen.contains(next)) {
                        continue;
                    }
                    indegree_3r[next - 'a']--;
                    if (indegree_3r[next - 'a'] == 0) {
                        queue.offer(next);
                        seen.add(next);
                        sb.append(next);
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    private boolean helper_3r(char c, boolean[] visited) {
        if (visited[c - 'a'])
            return true;
        
        visited[c - 'a'] = true;
        for(char next : graph_3r.get(c)) {
            if (helper_3r(next, visited))
                return true;
        }
        visited[c - 'a'] = false;
        
        return false;
    }
}
