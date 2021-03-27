package leetcode.dp;

public class CombinationSumIV {
    // top-down recursion + memorization
    public int combinationSum4(int[] nums, int target) {
        Integer[] memo = new Integer[target + 1];
        return helper(nums, target, memo);
    }

    private int helper(int[] nums, int target, Integer[] memo) {
        if (target == 0)
            return 1;

        if (memo[target] != null)
            return memo[target];

        int res = 0;
        for(int num : nums) {
            if (num <= target) {
                res += helper(nums, target - num, memo);
            }
        }
        memo[target] = res;
        return res;
    }
}
