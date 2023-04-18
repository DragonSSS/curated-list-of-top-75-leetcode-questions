package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0)
            return 0;

        int res = 0;
        int maxFreq = 0;
        int left = 0;
        int[] freqMap = new int[26];

        for (int right = 0; right < s.length(); right++) {
            char cur = s.charAt(right);
            freqMap[cur - 'A']++;
            maxFreq = Math.max(maxFreq, freqMap[cur - 'A']);
            int len = right - left + 1;
            if (len - maxFreq > k) {
                freqMap[s.charAt(left) - 'A']--;
                left++;
            } else {
                res = Math.max(res, len);
            }

        }

        return res;
    }

    public int characterReplacement_2r(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int res = 0;
        char[] chars = s.toCharArray();
        for(int right = 0; right < s.length(); right++) {
            char cur = chars[right];
            freq[cur - 'A']++;
            maxFreq = Math.max(maxFreq, freq[cur - 'A']);
            int curLen = right - left + 1;
            if (curLen - maxFreq > k) {
                freq[chars[left] - 'A']--;
                left++;
            } else {
                res = Math.max(res, curLen);
            }
        }
        return res;
    }

    public int characterReplacement_3r(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int right = 0;
        int res = 0;
        int maxFreq = 0;
        while(right < s.length()) {
            char c = s.charAt(right);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);
            int curLen = right - left + 1;
            if (curLen - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            } else {
                res = Math.max(res, curLen);
            }
            right++;
        }
        
        return res;
    }

    public int characterReplacement_4r(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.putIfAbsent(c, 0);
        }

        int left = 0, right = 0;
        int maxFreq = 0, res = 0;
        while(right < s.length()) {
            char rightChar = s.charAt(right);
            int rightFreq = map.get(rightChar) + 1;
            map.put(rightChar, rightFreq);
            maxFreq = Math.max(maxFreq, rightFreq);
            int len = right - left + 1;
            if (len - maxFreq > k) {
                char leftChar = s.charAt(left);
                int leftFreq = map.get(leftChar);
                map.put(leftChar, leftFreq - 1);
                left++;
            } else {
                res = Math.max(res, len);
            }
            right++;
        }
        return res;
    }
}
