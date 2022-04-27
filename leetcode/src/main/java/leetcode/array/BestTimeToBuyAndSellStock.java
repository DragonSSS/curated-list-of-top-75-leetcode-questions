package leetcode.array;

public class BestTimeToBuyAndSellStock {
    private int minPrice = Integer.MAX_VALUE;
    private int maxProfit = Integer.MIN_VALUE;
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;

        for(int price : prices) {
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    public int maxProfit_2r(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for(int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        
        return maxProfit;
    }
}
