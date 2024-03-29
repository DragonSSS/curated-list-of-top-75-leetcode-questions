package leetcode.dp;

public class DistinctSubsequences {
    // s = rabbbit
    // t = rabbit
    Integer[][] memo;
    public int numDistinct(String s, String t) {
        memo = new Integer[s.length()][t.length()];
        return helper(s, t, 0, 0);
    }
    
    private int helper(String s, String t, int indexS, int indexT) {
        // this has to be before indexS check
        if (indexT == t.length())
            return 1;
        
        if (indexS == s.length())
            return 0;
        
        if (memo[indexS][indexT] != null)
            return memo[indexS][indexT];
        
        if (s.charAt(indexS) == t.charAt(indexT)) {
            memo[indexS][indexT] = helper(s, t, indexS + 1, indexT + 1) + helper(s, t, indexS + 1, indexT);   
        } else {
            memo[indexS][indexT] = helper(s, t, indexS + 1, indexT);
        }
        
        return memo[indexS][indexT];
    }   
}
