package leetcode.binary;

public class CountingBits {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];

        dp[0] = 0;
        if (num == 0)
            return dp;

        dp[1] = 1;
        if (num == 1)
            return dp;

        for (int i = 2; i < num + 1; i++) {
            // 2^x
            if ((i & (i - 1)) == 0) {
                dp[i] = 1;
            } else {
                // 4(0100) -> 2(0010)
                // 3(0011) -> 2(0010) + 1
                if (i % 2 == 0) {
                    dp[i] = dp[i / 2];
                } else {
                    dp[i] = dp[i - 1] + 1;
                }
            }
        }
        return dp;
    }
}
