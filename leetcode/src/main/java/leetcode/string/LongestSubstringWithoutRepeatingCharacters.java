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
    public int lengthOfLongestSubstring_2r(String s) {
        int res = 0, left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                res = Math.max(res, set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return res;
    }
}
