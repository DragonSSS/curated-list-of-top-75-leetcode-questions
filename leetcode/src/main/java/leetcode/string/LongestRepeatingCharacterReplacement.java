package leetcode.string;

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
}
