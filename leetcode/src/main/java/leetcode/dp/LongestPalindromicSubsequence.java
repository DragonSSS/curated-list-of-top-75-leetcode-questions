package leetcode.dp;

public class LongestPalindromicSubsequence {
    // similar to #1143
    public int longestPalindromeSubseq(String s) {
        return helper(s, 0, s.length() - 1, new Integer[s.length()][s.length()]);
    }
    
    private int helper(String s, int start, int end, Integer[][] memo) {
        if (start > end)
            return 0;
        
        if (start == end)
            return 1;
        
        if (memo[start][end] != null)
            return memo[start][end];
        
        if (s.charAt(start) == s.charAt(end)) {
            memo[start][end] = 2 + helper(s, start + 1, end - 1, memo);
        } else {
            memo[start][end] = Math.max(helper(s, start + 1, end, memo), helper(s, start, end - 1, memo));
        }
        
        return memo[start][end];
    }    
}
