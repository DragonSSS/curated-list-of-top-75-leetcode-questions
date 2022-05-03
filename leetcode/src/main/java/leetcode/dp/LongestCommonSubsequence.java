package leetcode.dp;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer[][] memo = new Integer[text1.length()][text2.length()];
        // 2rd round func
        // return helper_2r(text1, text2, 0, 0, memo);
        return helper(text1, text2, 0, 0, memo);
    }

    private int helper(String text1, String text2, int cur1, int cur2, Integer[][] memo) {
        if (cur1 == text1.length() || cur2 == text2.length())
            return 0;

        if (memo[cur1][cur2] != null)
            return memo[cur1][cur2];

        int res1 = 0, res2 = 0;
        if (text1.charAt(cur1) == text2.charAt(cur2)) {
            res1 = helper(text1, text2, cur1 + 1, cur2 + 1, memo) + 1;
        }

        res2 = Math.max(helper(text1, text2, cur1 + 1, cur2, memo),
                helper(text1, text2, cur1, cur2 + 1, memo));

        int res = Math.max(res1, res2);

        memo[cur1][cur2] = res;
        return res;
    }

    private int helper_2r(String text1, String text2, int index1, int index2, Integer[][] memo) {
        if(index2 == text2.length() || index1 == text1.length())
            return 0;
        
        if(memo[index1][index2] != null)
            return memo[index1][index2];
        
        int curEqual = 0;
        if (text1.charAt(index1) == text2.charAt(index2)) {
            curEqual = helper(text1, text2, index1 + 1, index2 + 1, memo) + 1;
        }
        
        int nonEqual = Math.max(helper(text1, text2, index1, index2 + 1, memo), helper(text1, text2, index1 + 1, index2, memo));
        
        int res = Math.max(curEqual, nonEqual);
        memo[index1][index2] = res;
        return res;
    }

    // O(m*n)
    Integer[][] memo;
    public int longestCommonSubsequence_3r(String text1, String text2) {
        memo = new Integer[text1.length()][text2.length()];
        return helper_3r(0, 0, text1, text2);
    }
        
    private int helper_3r(int index1, int index2, String text1, String text2) {
        if (index1 == text1.length() || index2 == text2.length()) {
            return 0;
        }
            
        if (memo[index1][index2] != null)
            return memo[index1][index2];
            
        int res = 0;
        if(text1.charAt(index1) == text2.charAt(index2)) {
            res = helper_3r(index1 + 1, index2 + 1, text1, text2) + 1;
        } else {
            res = Math.max(
                helper_3r(index1 + 1, index2, text1, text2),
                helper_3r(index1, index2 + 1, text1, text2));
        }
        memo[index1][index2] = res;
        return res;
    }

    public int longestCommonSubsequence_3r_dp(String text1, String text2) {
        // text1 is row, text2 is col
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for(int i = text1.length() - 1; i >= 0; i--) {
            for(int j = text2.length() - 1; j >= 0; j--) {
                if(text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        
        return dp[0][0];
    }    
}
