package leetcode.dp;

public class HouseRobberII {
    public int rob(int[] nums) {
        // be careful about edge case, without this it will return 0
        if (nums.length == 1)
            return nums[0];

        Integer[] memo1 = new Integer[nums.length + 1];
        Integer[] memo2 = new Integer[nums.length + 1];

        int res1 = helper(nums, 0, nums.length - 2, memo1);
        int res2 = helper(nums, 1, nums.length - 1, memo2);

        return Math.max(res1, res2);
    }

    private int helper(int[] nums, int cur, int end, Integer[] memo) {
        if(cur >= end + 1)
            return 0;

        if (memo[cur] != null)
            return memo[cur];

        int res1 = helper(nums, cur + 2, end, memo) + nums[cur];
        int res2 = helper(nums, cur + 1, end, memo);

        int res = Math.max(res1, res2);
        memo[cur] = res;
        return res;
    }

    Integer[] memo1;
    Integer[] memo2;
    public int rob_2r(int[] nums) {
        memo1 = new Integer[nums.length];
        memo2 = new Integer[nums.length];
        
        if(nums.length == 1)
            return nums[0];
        
        int robFirst = helper_2r(nums, 0, true);
        int robSecond = helper_2r(nums, 1, false);
        
        return Math.max(robFirst, robSecond);
    }
    
    private int helper_2r(int[] nums, int index, boolean robFirst) {
        if(robFirst && index >= nums.length - 1) {
            return 0;
        } else if (!robFirst && index >= nums.length) {
            return 0;
        }
        
        if(robFirst && memo1[index] != null ) {
            return memo1[index];
        } else if (!robFirst && memo2[index] != null) {
            return memo2[index];
        }
        
        int skip = helper_2r(nums, index + 1, robFirst);
        int nonSkip = helper_2r(nums, index + 2, robFirst) + nums[index];
        
        int res = Math.max(skip, nonSkip);

        if (robFirst) {
            memo1[index] = res;
        } else {
            memo2[index] = res;
        }
        
        return res;
    }
}
