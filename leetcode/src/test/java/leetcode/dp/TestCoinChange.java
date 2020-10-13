package leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCoinChange {

    @Test
    public void testCoinChange() {
        int actual = new CoinChange().coinChange(new int[]{1, 2, 5}, 11);
        assertEquals(3, actual);
    }
}
