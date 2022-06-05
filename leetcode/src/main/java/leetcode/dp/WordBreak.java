package leetcode.dp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] visited = new boolean[s.length() + 1];
        // return helper_2r_dfs(s, 0, new HashSet<String>(wordDict), new HashSet<Integer>());
        return helper(s, 0, wordDict, visited);
    }

    private boolean helper(String s, int index, List<String> wordDict, boolean[] visited) {
        if (index == s.length())
            return true;

        visited[index] = true;

        // note:  i < s.length() + 1 to get all of chars as substring()
        for(int i = index + 1; i < s.length() + 1; i++) {
            String subStr = s.substring(index, i);
            if (!visited[i] && wordDict.contains(subStr) && helper(s, i, wordDict, visited))
                return true;
        }

        return false;
    }

    private boolean helper_2r_dfs(String s, int index, Set<String> words, Set<Integer> visited) {
        if (index == s.length())
            return true;
        
        visited.add(index);
        
        for(int i = index + 1; i < s.length() + 1; i++) {
            if(!visited.contains(i) && words.contains(s.substring(index, i)) && helper_2r_dfs(s, i, words, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean wordBreak_2r_bfs(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited.add(0);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                if(cur == s.length())
                    return true;
                for(int j = cur + 1; j < s.length() + 1; j++) {
                    String sub = s.substring(cur, j);
                    if(words.contains(sub) && !visited.contains(j)) {
                        queue.offer(j);
                        visited.add(j);
                    }
                }
            }
        }
        return false;
    }

    //O(n^3) because of substr
    public boolean wordBreak_3r_bfs(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(0);
        queue.offer(0);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (cur == s.length())
                    return true;
                
                for(int j = cur + 1; j <= s.length(); j++) {
                    String next = s.substring(cur, j);
                    if(words.contains(next) && !visited.contains(j)) {
                        queue.offer(j);
                        visited.add(j);
                    }
                }
            }
        }
        
        return false;
    }

    boolean[] visited;
    public boolean wordBreak_4r(String s, List<String> wordDict) {
        visited = new boolean[s.length() + 1];
        Set<String> words = new HashSet<>(wordDict);
        return helper_4r(s, 0, words);
    }
    
    private boolean helper_4r(String s, int index, Set<String> words) {
        if(index == s.length()) {
            return true;
        }
        
        visited[index] = true;
        
        for(int i = index + 1; i <= s.length(); i++) {
            String cur = s.substring(index, i);
            if (!visited[i] && words.contains(cur) && helper_4r(s, i, words)) {
                return true;
            }
        }
        
        return false;
    }
}
