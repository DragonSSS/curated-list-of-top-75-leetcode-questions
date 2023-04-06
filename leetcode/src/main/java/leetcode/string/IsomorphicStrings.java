package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    // egg 011
    // add 011
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            int index1 = map1.getOrDefault(c1, -1);
            int index2 = map2.getOrDefault(c2, -1);

            if (index1 != index2) {
                return false;
            }
            
            if (index1 == -1) {
                map1.put(c1, i);
                map2.put(c2, i);
            }
        }
        return true;
    }    
}
