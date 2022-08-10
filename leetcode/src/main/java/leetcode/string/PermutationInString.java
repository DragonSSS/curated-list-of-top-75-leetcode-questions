package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    // hashmap + sliding window
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int matching = 0;
        for(int i = 0; i < s2.length(); i++) {
            char cur = s2.charAt(i);
            if(map.containsKey(cur)) {
                map.put(cur, map.get(cur) - 1);
                if (map.get(cur) == 0) {
                    matching++;
                }
            }
            
            if (i >= s1.length()) {
                char pre = s2.charAt(i - s1.length());
                if (map.containsKey(pre)) {
                    if (map.get(pre) == 0) {
                        matching--;
                    }
                    map.put(pre, map.get(pre) + 1);
                }
            }
            
            if (matching == map.keySet().size())
                return true;
        }
        
        return false;
    }    
}
