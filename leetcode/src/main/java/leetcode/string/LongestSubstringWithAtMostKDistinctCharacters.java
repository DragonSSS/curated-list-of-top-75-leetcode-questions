package leetcode.string;

public class LongestSubstringWithAtMostKDistinctCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        char[] chars = s.toCharArray();
        int right = 0, left = 0;
        int countUnique = 0;
        int res = 0;
        int[] map = new int[128];
        for(;right < chars.length; right++) {
            map[chars[right]]++;
            if (map[chars[right]] == 1) {
                countUnique++;
            }
            
            while(countUnique > k) {
                map[chars[left]]--;
                if (map[chars[left]] == 0) {
                    countUnique--;
                }
                left++;
            }

            res = Math.max(res, right - left + 1);
        }
        return res;
    }    
}
