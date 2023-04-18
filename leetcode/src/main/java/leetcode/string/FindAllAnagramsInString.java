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

    public List<Integer> findAnagrams_2r(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) {
            return res;
        }
        // build the char map for p string
        Map<Character, Integer> map = new HashMap<>();
        for(char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // sliding window with two pointers
        int count = map.size();
        int left = 0, right = 0;
        while(right < s.length()) {
            // move right first to cover map of p
            char rightChar = s.charAt(right);
            if (map.containsKey(rightChar)) {
                int curFreq = map.get(rightChar);
                map.put(rightChar, curFreq - 1);
                if (curFreq == 1) {
                    count--;
                }
            }
            right++;

            while(count == 0) {
                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    int curFreq = map.get(leftChar);
                    map.put(leftChar, curFreq + 1);
                    if (curFreq == 0) {
                        count++;
                    }
                }

                if (right - left == p.length()) {
                    res.add(left);
                }
                left++;
            }

        }
        
        return res;
    }
}
