package leetcode.dp;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        // dfs without dp
        if (amount == 0)
            return 0;

        if (coins == null || coins.length == 0)
            return -1;

        int[] memo = new int[amount + 1];


        return dfs(coins, amount, memo);
    }

    // this method return the minimum number of coins that make up the amount
    // use memo map to memorize previous results
    private int dfs(int[] coins, int amount, int[] memo) {

        // base case
        if (amount == 0)
            return 0;

        int res = Integer.MAX_VALUE;

        for (int coin : coins) {
            if (coin > amount)
                continue;

            int temp;

            if (memo[amount - coin] != 0) {
                temp = memo[amount - coin];
            } else {
                temp = dfs(coins, amount - coin, memo);
                memo[amount - coin] = temp;
            }

            // skip the current result if the previous result is -1 (invalid path)
            if (temp == -1) {
                continue;
            }

            // previous result + 1 (current number coin = 1)
            res = Math.min(res, temp + 1);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
