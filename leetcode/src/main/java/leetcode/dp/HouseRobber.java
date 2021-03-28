package leetcode.dp;

public class HouseRobber {
    public int rob(int[] nums) {
        Integer[] memo = new Integer[nums.length + 1];
        return helper(nums, 0, memo);
    }

    private int helper(int[] nums, int cur, Integer[] memo){
        if (cur >= nums.length)
            return 0;

        if (memo[cur] != null)
            return memo[cur];

        int res1 = 0, res2 = 0;

        res1 = helper(nums, cur + 2, memo) + nums[cur];
        res2 = helper(nums, cur + 1, memo);

        int res = Math.max(res1, res2);
        memo[cur] = res;

        return res;
    }
}
