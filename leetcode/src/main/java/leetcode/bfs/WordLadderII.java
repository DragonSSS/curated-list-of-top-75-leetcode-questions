package leetcode.bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Queue;


public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        Set<String> words = new HashSet<>(wordList);
        Map<String, Integer> distances = new HashMap<>();
        Map<String, Set<String>> graph = new HashMap<>();
        
        // use bfs to build the graph and record the distance between beginWord and currentWord
        helper_bfs(beginWord, endWord, distances, graph, words);
        // use dfs to find all shortest paths between beginWord and endWord
        helper_dfs(beginWord, endWord, distances, graph, new ArrayList<>(Arrays.asList(beginWord)), res);
        
        return res;
    }
    
    private void helper_dfs(String beginWord, String endWord, Map<String, Integer> distances, Map<String, Set<String>> graph, List<String> curList, List<List<String>> res) {
        if (beginWord.equals(endWord)) {
            res.add(new ArrayList<>(curList));
            return;
        }
        
        if (!graph.containsKey(beginWord)) {
            return;
        }
        
        for (String next : graph.get(beginWord)) {
            if (distances.get(next) == distances.get(beginWord) + 1) {
                curList.add(next);
                helper_dfs(next, endWord, distances, graph, curList, res);
                curList.remove(curList.size() - 1);
            }
        }
    }
    
    private void helper_bfs(String beginWord, String endWord, Map<String, Integer> distances, Map<String, Set<String>> graph, Set<String> words) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        distances.put(beginWord, 0);
        boolean found = false;
        int distance = 1;
        
        while(!found && !queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                List<String> nexts = findNextWords(currentWord, words);
                graph.put(currentWord, new HashSet<>(nexts));
                for(String next : nexts) {
                    if (!distances.containsKey(next)) {
                        distances.put(next, distance);
                        if (next.equals(endWord)) {
                            found = true;
                        } else {
                            queue.offer(next);
                        }
                    }
                }
            }
            distance++;
        }
    }
    
    private List<String> findNextWords(String word, Set<String> words) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0 ; i < word.length(); i++) {
            char temp = word.charAt(i);
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == temp)
                    continue;
                sb.setCharAt(i, c);
                String newWord = sb.toString();
                if (words.contains(newWord)) {
                    res.add(newWord);
                }
            }
            sb.setCharAt(i, temp);
        }
        return res;
    }
}
