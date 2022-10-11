package leetcode.dp;

public class BurstBalloons {
    // dp with memorization
    int[][] memo;
    public int maxCoins(int[] nums) {
        memo = new int[nums.length][nums.length];
        return helper(nums, 0, nums.length - 1);
    }
    
    private int helper(int[] nums, int left, int right) {
        if (left > right)
            return 0;
        
        if (memo[left][right] != 0)
            return memo[left][right];
        
        int res;
        // i index is the last balloon to burst
        // left to i - 1 is the sub array
        // i + 1 to right is the sub array
        // [1,2,3,4, 6, 7,8,9]
        
        for (int i = left; i <= right; i++) {
            res = nums[i];
            
            if (left - 1 >= 0)
                res *= nums[left - 1];
            
            if (right + 1 < nums.length)
                res *= nums[right + 1];
            
            res += helper(nums, left, i - 1) + helper(nums, i + 1, right);
            memo[left][right] = Math.max(memo[left][right], res);
        }
        return memo[left][right];
    }    
}
