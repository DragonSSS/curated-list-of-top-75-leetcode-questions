package leetcode.dp;

public class CoinChange2 {
    public int change(int amount, int[] coins) {
        Integer[][] memo = new Integer[coins.length][amount + 1];
        return helper(amount, 0, coins, memo);
    }

    private int helper(int amount, int index, int[] coins, Integer[][] memo) {
        if (amount == 0)
            return 1;

        if (index == coins.length)
            return 0;

        if (memo[index][amount] != null)
            return memo[index][amount];

        int res1 = 0;

        if (amount >= coins[index])
            res1 = helper(amount - coins[index], index, coins, memo);

        int res2 = helper(amount, index + 1, coins, memo);

        memo[index][amount] = res1 + res2;
        return memo[index][amount];
    }
}
