package leetcode.string;

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int curRunLength = 1, preRunLength = 0, res = 0;
        //1 <= s.length <= 10^5
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curRunLength++;
            } else {
                preRunLength = curRunLength;
                curRunLength = 1;
            }
            
            if (preRunLength >= curRunLength)
                res++;
        }
        return res;
    }
}
