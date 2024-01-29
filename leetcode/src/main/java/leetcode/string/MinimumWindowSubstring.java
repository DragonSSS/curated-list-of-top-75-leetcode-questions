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

    // O(n)
    public String minWindow_2r(String s, String t) {
        if(t.length() > s.length())
            return "";
        
        Map<Character, Integer> map = new HashMap<>(); 
        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int count = 0; // number of chars to consider
        int minLen = Integer.MAX_VALUE; // minimum length
        int left = 0; // slow pointer
        int index = 0; // minLen start index
        
        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if(!map.containsKey(rightChar)) {
                continue;
            }
            
            int curRightCount = map.get(rightChar);
            map.put(rightChar, curRightCount - 1);
            if (curRightCount == 1) {
                count++;
            }
            
            while(count == map.size()) {
                
                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    index = left;
                }
                
                char leftChar = s.charAt(left);
                left++;
                if (!map.containsKey(leftChar)) {
                    continue;
                }
                
                int curLeftCount = map.get(leftChar);
                map.put(leftChar, curLeftCount + 1);
                if (curLeftCount == 0) {
                    count--;
                }
            }
        }
        
        return minLen == Integer.MAX_VALUE? "" : s.substring(index, index + minLen);
    }

    public String minWindow_3r(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();
        
        for(char c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int index = 0;
        int left = 0;
        
        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if(!freq.containsKey(rightChar))
                continue;
            
            int rightCharFreq = freq.get(rightChar);
            freq.put(rightChar, rightCharFreq - 1);
            if (rightCharFreq == 1) {
                count++;
            }
            
            while(count == freq.size()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    index = left;
                }
                
                char leftChar = s.charAt(left);
                left++;
                if(!freq.containsKey(leftChar))
                    continue;
                
                int leftCharFreq = freq.get(leftChar);
                freq.put(leftChar, leftCharFreq + 1);
                if (leftCharFreq == 0) {
                    count--;
                }   
            }
        }
        
        return minLen == Integer.MAX_VALUE? "" : s.substring(index, index + minLen);
    }

    public String minWindow_4r(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int minLen = Integer.MAX_VALUE;
        int count = 0;
        int left = 0;
        int index = 0;
        for(int right = 0; right < s.length(); right++) {
            char charRight = s.charAt(right);
            if(!map.containsKey(charRight)) {
                continue;
            }

            map.put(charRight, map.get(charRight) - 1);
            if(map.get(charRight) == 0) {
                count++;
            }

            while(count == map.size()) {
                int curLen = right - left + 1;
                if (curLen < minLen) {
                    minLen = curLen;
                    index = left;
                }

                char leftChar = s.charAt(left++);
                if(!map.containsKey(leftChar)) {
                    continue;
                }

                map.put(leftChar, map.get(leftChar) + 1);
                if (map.get(leftChar) == 1) {
                    count--;
                }
            }
        }
        return minLen == Integer.MAX_VALUE? "" : s.substring(index, index + minLen);
    }

    public String minWindow_5r(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int index = 0;
        for(;right < s.length(); right++) {
            char cur = s.charAt(right);
            if (!map.containsKey(cur)) {
                continue;
            }

            map.put(cur, map.get(cur) - 1);
            if (map.get(cur) == 0) {
                count++;
            }

            while(count == map.size()) {
                int len = right - left + 1;
                if (len < minLen) {
                    index = left;
                    minLen = len;
                }

                cur = s.charAt(left++);
                if(!map.containsKey(cur)) {
                    continue;
                }

                map.put(cur, map.get(cur) + 1);
                if (map.get(cur) == 1) {
                    count--;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(index, index + minLen);
    }    
}
