package leetcode.dp;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer[][] memo = new Integer[text1.length()][text2.length()];
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
}
