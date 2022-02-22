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
}
