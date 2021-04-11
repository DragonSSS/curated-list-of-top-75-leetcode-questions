package leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBestTimeToBuyAndSellStock {
    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSellStock testInstance = new BestTimeToBuyAndSellStock();
        int result = testInstance.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, result);
    }
}
