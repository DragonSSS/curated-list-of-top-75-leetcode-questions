package leetcode.dp;

import java.util.Arrays;

public class IntegerBreak {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];

        // positive integer should be greater than or equal to 1
        Arrays.fill(dp, 1);

        // start with n = 3 as when n = 1 or 2, dp[n] = 1;
        for(int i = 3; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                // keep finding max dp[i] by split into two numbers or multiple (>2) numbers
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[i - j] * j));
            }
        }

        return dp[n];
    }

//    method 2
//    public int integerBreak(int n) {
//        if (n == 2 || n == 3) return n - 1;
//        int res = 1;
//        while (n > 4) {
//            res *= 3;
//            n -= 3;
//        }
//        return res * n;
//    }
}
