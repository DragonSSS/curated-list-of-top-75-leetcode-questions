package leetcode.dp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

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

    public int coinChange_2r_bfs(int[] coins, int amount) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(amount);
        visited.add(amount);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int curAmount = queue.poll();
                if (curAmount == 0) return count;
                for(int coin : coins) {
                    int nextAmount = curAmount - coin;
                    if(nextAmount >= 0 && !visited.contains(nextAmount)) {
                        queue.offer(nextAmount);
                        visited.add(nextAmount);
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
