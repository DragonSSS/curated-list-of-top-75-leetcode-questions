package leetcode.array;

public class PartitionEqualSubsetSum {
    Boolean[][] memo;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        if(sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        int n = nums.length;
        memo = new Boolean[n][target + 1];

        return helper(0, target, nums);
    }

    private boolean helper(int index, int sum, int[] nums) {
        if(index >= nums.length || sum < 0) {
            return false;
        }

        if(sum == 0) {
            return true;
        }

        if(memo[index][sum] != null) {
            return memo[index][sum];
        }

        boolean res = helper(index + 1, sum - nums[index], nums) || helper(index + 1, sum, nums);
        memo[index][sum] = res;
        return res;
    }    
}
