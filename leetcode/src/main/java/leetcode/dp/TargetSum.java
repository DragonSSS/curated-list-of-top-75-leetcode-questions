package leetcode.dp;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0);
    }
    
    private int helper(int[] nums, int target, int index) {
        if (index == nums.length) {
            return target == 0 ? 1 : 0;
        } else {
            return helper(nums, target + nums[index], index + 1) + helper(nums, target - nums[index], index + 1);
        }
    }    
}
