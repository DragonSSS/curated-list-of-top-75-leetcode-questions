package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";

        int slow = 0;
        int minLen = Integer.MAX_VALUE;
        int index = 0;
        int count = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int fast = 0; fast < s.length(); fast++) {
            char fastCh = s.charAt(fast);
            if (!map.containsKey(fastCh))
                continue;

            int fastCount = map.get(fastCh);
            map.put(fastCh, fastCount - 1);
            if (fastCount == 1) {
                count++;
            }

            while(count == map.size()) {
                if (fast - slow + 1 < minLen) {
                    minLen = fast - slow + 1;
                    index = slow;
                }

                char slowCh = s.charAt(slow++);
                if (!map.containsKey(slowCh))
                    continue;
                int slowCount = map.get(slowCh);
                map.put(slowCh, slowCount + 1);

                if (slowCount == 0) {
                    count--;
                }
            }
        }

        return minLen == Integer.MAX_VALUE? "" : s.substring(index, index + minLen);
    }
}
