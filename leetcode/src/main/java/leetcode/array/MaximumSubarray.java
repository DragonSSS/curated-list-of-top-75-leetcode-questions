package leetcode.array;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];

        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            res = Math.max(res, dp[i]);
        }

        return res;


        // Make space O(1)
        /*
        if (nums.length == 0)
            return 0;

        int curMax = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            curMax = Math.max(curMax + nums[i], nums[i]);
            res = Math.max(res, curMax);
        }
        return res;
        */
    }

    int res = Integer.MIN_VALUE;
    public int maxSubArray_2r_dfs(int[] nums) {
        helper(0, nums);
        return res;
    }
    
    private int helper(int index, int[] nums) {
        if (index == nums.length)
            return 0;
        
        int exclude = nums[index];
        int include = nums[index] + helper(index + 1, nums);
        
        res = Math.max(res, 
                       Math.max(include, exclude));
        
        return Math.max(include, exclude);
    }

    public int maxSubArray_2r_dp(int[] nums) {        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res = Math.max(dp[i], res);
        }
        return res;
    }

    // Kadane's algorithm - Maximum subrray sum
    public int maxSubArray_3r(int[] nums) {
        int localMax = 0, globalMax = Integer.MIN_VALUE;
        
        for(int num : nums) {
            localMax = Math.max(num, num + localMax);
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }
        
        return globalMax;
    }
}
