package leetcode.dp;

public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] hold = new int[n];
        int[] sell = new int[n];
        hold[0] = -1 * prices[0];

        for(int i = 1; i < n; i++) {
            hold[i] = Math.max(hold[i - 1], sell[i - 1] - prices[i]);
            sell[i] = Math.max(sell[i - 1], hold[i - 1] + prices[i] - fee);
        }
        return sell[n - 1];
    }    
}
