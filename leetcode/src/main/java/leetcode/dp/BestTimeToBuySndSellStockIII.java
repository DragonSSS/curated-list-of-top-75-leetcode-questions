package leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuySndSellStockIII {
    Map<String, Integer> memo = new HashMap<>();
    public int maxProfit_tle(int[] prices) {
        return helper_tle(0, 0, prices, true);
    }


    private int helper_tle(int index, int maxTransactions, int prices[], boolean isBuy) {
        if (index > prices.length - 1 || maxTransactions == 2) {
            return 0;
        }

        String key = index + "kun" + isBuy + "aguero" + maxTransactions;
        if (memo.containsKey(key)) return memo.get(key);


        int maxProfit;
        if (isBuy) {
            int profitWhenStockBought = helper_tle(index + 1, maxTransactions, prices, false) - prices[index];
            int profitWhenDoNothing = helper_tle(index + 1, maxTransactions, prices, true);
            maxProfit = Math.max(profitWhenStockBought, profitWhenDoNothing);
        } else {
            int profitWhenStockSold = helper_tle(index + 1, maxTransactions + 1, prices, true) + prices[index];
            int profitWhenDoNothingWhileSell = helper_tle(index + 1, maxTransactions, prices, false);
            maxProfit = Math.max(profitWhenStockSold, profitWhenDoNothingWhileSell);
        }
        memo.put(key, maxProfit);

        return maxProfit;
    }
}
