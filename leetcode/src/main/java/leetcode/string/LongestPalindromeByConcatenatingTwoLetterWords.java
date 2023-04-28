package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeByConcatenatingTwoLetterWords {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int res = 0;
        for(String word: words) {
            StringBuilder sb = new StringBuilder(word);
            String reverse = sb.reverse().toString();
            if(map.containsKey(reverse)) {
                res += 4;
                map.put(reverse, map.get(reverse) - 1);
                if (map.get(reverse) == 0) {
                    map.remove(reverse);
                }
            } else {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for(String key : map.keySet()){
            if (map.get(key) >= 1) {
                StringBuilder sb = new StringBuilder(key);
                String reverse = sb.reverse().toString();
                if (key.equals(reverse)) {
                    res += 2;
                    break;
                }
            }
        }

        return res;
    }    
}
