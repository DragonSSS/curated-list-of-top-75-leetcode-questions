package leetcode.dp;

public class DecodeWays {
    public int numDecodings(String s) {
        Integer[] memo = new Integer[s.length() + 1];
        return helper(s, 0, memo);
    }

    private int helper(String s, int index, Integer[] memo) {
        if (index == s.length())
            return 1;

        if (memo[index] != null)
            return memo[index];

        int res = 0;

        int val1 = Integer.valueOf(s.substring(index, index + 1));
        if(val1 > 0 && val1 < 10)
            res = helper(s, index + 1, memo);

        // take care of boundary
        if (index + 2 <= s.length()) {
            int val2 = Integer.valueOf(s.substring(index, index + 2));
            if(val2 > 9 && val2 < 27)
                res += helper(s, index + 2, memo);
        }

        memo[index] = res;
        return res;
    }
}