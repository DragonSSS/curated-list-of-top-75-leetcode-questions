package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class NumberOfMatchingSubsequences {
    // hashtable + IsSubsequence
    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        char[] sChars = s.toCharArray();
        int res = 0;
        for(String word : map.keySet()) {
            char[] wordChars = word.toCharArray();
            int i = 0, j = 0;
            while(i < wordChars.length && j < sChars.length) {
                if (wordChars[i] == sChars[j]) {
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            
            if (i == wordChars.length)
                res += map.get(word);
            
        }
        
        return res;
    }
}
