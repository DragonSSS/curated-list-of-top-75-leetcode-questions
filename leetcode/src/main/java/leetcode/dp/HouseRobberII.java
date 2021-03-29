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
}
