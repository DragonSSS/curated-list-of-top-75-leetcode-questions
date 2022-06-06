package leetcode.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreakII {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return helper(s, wordDict, new HashMap<>());
    }

    private List<String> helper(String s, List<String> dict, Map<String, List<String>> map) {
        if(map.containsKey(s))
            return map.get(s);

        List<String> res = new ArrayList<>();
        if(s.length() == 0) {
            res.add("");
            return res;
        }

        for(String word : dict) {
            if(s.startsWith(word)) {
                String cur = s.substring(word.length());
                List<String> curRes = helper(cur, dict, map);
                for(String str : curRes) {
                    res.add(word + (str.length() == 0 ? "" : " ") + str);
                }
            }
        }

        map.put(s, res);
        return res;
    }

    public List<String> wordBreak_2r(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        int[] dict = new int[26];
        for(String word: wordDict) {
            for(char c : word.toCharArray()) {
                dict[c - 'a']++;
            }
        }
        
        for(char c : s.toCharArray()) {
            if (dict[c - 'a'] == 0) {
                return res;
            }
        }
        
        Set<String> words = new HashSet<>(wordDict);
        helper_2r(s, 0, words, res, new StringBuilder());
        return res;
    }
    
    private void helper_2r(String s, int index, Set<String> words, List<String> res, StringBuilder sb) {
        if (index == s.length()) {
            res.add(sb.toString());
            return;
        }
        
        for(int i = index + 1; i <= s.length(); i++) {
            String str = s.substring(index, i);
            if (words.contains(str)) {
                int start = sb.length();
                sb.append(str);
                if (i != s.length())
                    sb.append(" ");
                helper_2r(s, i, words, res, sb);
                sb.delete(start, sb.length());
            }
        }
    }
}
