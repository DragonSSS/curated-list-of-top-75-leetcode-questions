package leetcode.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        Integer[][] memo = new Integer[nums.length + 1][nums.length];
        return helper(nums, 0, -1, memo);
    }

    private int helper(int[] nums, int cur, int pre, Integer[][] memo) {
        if (cur == nums.length)
            return 0;

        if (memo[pre + 1][cur] != null) {
            return memo[pre + 1][cur];
        }

        int with = 0;
        if (pre == -1 || nums[cur] > nums[pre])
            with = helper(nums, cur + 1, cur, memo) + 1;

        int without = helper(nums, cur + 1, pre, memo);

        int res = Math.max(with, without);
        memo[pre + 1][cur] = res;
        return res;
    }

    Integer[][] memo;
    public int lengthOfLIS_2r(int[] nums) {
        memo = new Integer[nums.length + 1][nums.length];
        return helper_2r(0, -1, nums);
    }
    
    private int helper_2r(int index, int pre, int[] nums) {
        if (index == nums.length)
            return 0;
        
        if(memo[pre + 1][index] != null)
            return memo[pre + 1][index];
        
        int with = 0;
        if (pre == -1 || nums[index] > nums[pre]) {
            with = helper_2r(index + 1, index, nums) + 1;
        }
        
        int without = helper_2r(index + 1, pre, nums);
        
        int res = Math.max(with, without);
        memo[pre + 1][index] = res;
        return res;
    }

    public int lengthOfLIS_3r(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int res = 1;
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    res = Math.max(dp[i], res);
                }
            }
        }
        
        return res;
    }
}
