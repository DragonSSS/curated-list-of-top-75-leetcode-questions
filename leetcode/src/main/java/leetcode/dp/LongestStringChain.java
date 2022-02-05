package leetcode.dp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestStringChain {
    public int longestStrChain(String[] words) {
        Set<String> set = new HashSet<>();
        Map<String, Integer> memo = new HashMap<>();
        for (String word: words) {
            set.add(word);
        }
        
        int res = 0;
        for (String word : words) {
            res = Math.max(res, helper(word, set, memo));
        }
        
        return res;
        
    }
    
    private int helper(String word, Set<String> set, Map<String, Integer> memo) {
        if (memo.containsKey(word))
            return memo.get(word);
        
        int max = 0;
        StringBuilder sb = new StringBuilder(word);
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            sb.deleteCharAt(i);
            String s = sb.toString();
            if (set.contains(word)) {
                max = Math.max(max, helper(s, set, memo) + 1);
            }
            sb.insert(i, c);
        }
        
        memo.put(word, max);
        return max;
    }   
}
