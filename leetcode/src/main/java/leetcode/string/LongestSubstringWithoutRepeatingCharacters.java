package leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        // two pointers + sliding window
        int res = 0;
        int left = 0, right = 0;
        Set<Character> hashSet = new HashSet<>();

        while(right < s.length()) {
            if(!hashSet.contains(s.charAt(right))) {
                hashSet.add(s.charAt(right));
                right++;
                res = Math.max(res, hashSet.size());
            } else {
                hashSet.remove(s.charAt(left));
                left++;
            }
        }
        return res;
    }

    // O(n)
    public int lengthOfLongestSubstring_2r(String s) {
        int res = 0;
        int left = 0;
        int right = 0;
        int[] freq = new int[128];
        while(right < s.length()) {
            char charRight = s.charAt(right);
            freq[charRight]++;
            while(freq[charRight] > 1) {
                char charLeft = s.charAt(left);
                freq[charLeft]--;
                left++;
            }
            
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }

    public int lengthOfLongestSubstring_3r(String s) {
        Set<Character> visited = new HashSet<>();
        int left = 0;
        int right = 0;
        int res = 0;
        while(right < s.length()) {
            char cur = s.charAt(right);
            if(!visited.contains(cur)) {
                visited.add(cur);
                right++;
            } else {
                visited.remove(s.charAt(left));
                left++;
            }
            
            res = Math.max(res, visited.size());
        }
        
        return res;
    }
}
