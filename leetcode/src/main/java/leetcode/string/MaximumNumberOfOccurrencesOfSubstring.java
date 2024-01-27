package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfOccurrencesOfSubstring {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> subStrFreq = new HashMap<>();
        int[] charFreq = new int[26];
        int left = 0, right = 0;
        int uniqueCount = 0;
        int res = 0;

        for(;right < s.length(); right++) {
            char cur = s.charAt(right);
            charFreq[cur - 'a']++;
            if (charFreq[cur - 'a'] == 1) {
                uniqueCount++;
            }

            while(right - left + 1 >= minSize && right - left + 1 <= maxSize) {
                if (uniqueCount <= maxLetters) {
                    String str = s.substring(left, right + 1);
                    subStrFreq.put(str, subStrFreq.getOrDefault(str, 0) + 1);
                }
                
                cur = s.charAt(left);
                charFreq[cur - 'a']--;

                if (charFreq[cur - 'a'] == 0) {
                    uniqueCount--;
                }
                left++;
            }
        }

        for(int val : subStrFreq.values()) {
            res = Math.max(res, val);
        }
        return res;
    }    
}
