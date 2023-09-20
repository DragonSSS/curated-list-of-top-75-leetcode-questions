package leetcode.dp;

public class StoneGame {
    Integer[][] memo;
    public boolean stoneGame(int[] piles) {
        int size = piles.length;
        int sum = 0;
        for(int val : piles) {
            sum += val;
        }
        
        memo = new Integer[size][size];
        return (helper(0, size - 1, piles) > sum / 2);
    }

    // Alice max get
    private int helper(int left, int right, int[] piles) {
        if (left > right) {
            return 0;
        }

        if (memo[left][right] != null) {
            return memo[left][right];
        }

        boolean even = (right - left) % 2 == 0;
        int leftVal = even ? piles[left] : 0;
        int rightVal = even ? piles[right] : 0;

        memo[left][right] = Math.max(helper(left + 1, right, piles) + leftVal, helper(left, right - 1, piles) + rightVal);
        return memo[left][right];
    }
}
