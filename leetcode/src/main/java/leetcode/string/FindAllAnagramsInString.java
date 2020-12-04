package leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInString {
    /*
    brute force

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length())
            return res;

        for(int i = 0; i < s.length() - p.length() + 1; i++) {
            if(helper(s.substring(i, i + p.length()), p))
                res.add(i);
        }
        return res;
    }

    private boolean helper(String s, String p) {
        int[] map = new int[26];

        for(int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[p.charAt(i) - 'a']--;
        }

        for (int i : map) {
            if (i != 0)
                return false;
        }
        return true;
    }
    */

    // sliding window + two pointers + hashtable
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length())
            return res;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = map.size();
        for(int right = 0; right < s.length(); right++) {
            char charRight = s.charAt(right);
            if (map.containsKey(charRight)) {
                map.put(charRight, map.get(charRight) - 1);
                if (map.get(charRight) == 0)
                    count--;
            }

            while(count == 0) {
                if (right - left + 1 == p.length()) {
                    res.add(left);
                }
                char charLeft = s.charAt(left);
                if (map.containsKey(charLeft)) {
                    map.put(charLeft, map.get(charLeft) + 1);
                    if (map.get(charLeft) == 1)
                        count++;
                }
                left++;
            }
        }

        return res;
    }
}
