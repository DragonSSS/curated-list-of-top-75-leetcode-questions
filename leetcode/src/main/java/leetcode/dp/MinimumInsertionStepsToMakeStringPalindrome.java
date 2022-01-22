package leetcode.dp;

public class MinimumInsertionStepsToMakeStringPalindrome {
    // similar to #516 Longest Palindromic Subsequence
    // to figure out minimum number of add or deletion to make string palindrome
    // equal to find longest palindrome subsequence
    public int minInsertions(String s) {
        int lps = longestPalindromeSubsequence(s, 0, s.length() - 1, new Integer[s.length()][s.length()]);
        return s.length() - lps;
    }
    
    private int longestPalindromeSubsequence(String s, int start, int end, Integer[][] memo) {
        if (start > end)
            return 0;
        
        if (start == end)
            return 1;
        
        if (memo[start][end] != null)
            return memo[start][end];
        
        if (s.charAt(start) == s.charAt(end)) {
            memo[start][end] = 2 + longestPalindromeSubsequence(s, start + 1, end - 1, memo);
        } else {
            memo[start][end] = Math.max(longestPalindromeSubsequence(s, start + 1, end, memo), longestPalindromeSubsequence(s, start, end - 1, memo));
        }
        
        return memo[start][end];
    }   
}
