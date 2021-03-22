package leetcode.dp;

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
}
