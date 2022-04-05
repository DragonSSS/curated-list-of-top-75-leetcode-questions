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
}
