package leetcode.dp;

public class RegularExpressionMatching {
    // aa
    // a. 
    // aaaa
    // a*
    // b*aaa
    boolean[][] memo;
    public boolean isMatch(String s, String p) {
        memo = new boolean[s.length() + 1][p.length() + 1];
        return helper(s, p, 0, 0);
    }
    
    private boolean helper(String s, String p, int i, int j) {
        if(memo[i][j])
            return memo[i][j];

        if(i >= s.length() && j >= p.length())
            return true;

        if (j >= p.length())
            return false;
        
        boolean match = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        if (j + 1 < p.length() && p.charAt(j + 1) == '*' ) {
            memo[i][j] = helper(s, p, i, j + 2) || (match && helper(s, p, i + 1, j));
        } else {
            memo[i][j] = match && helper(s, p, i + 1, j + 1);
        }
        
        return memo[i][j];
    }
}
