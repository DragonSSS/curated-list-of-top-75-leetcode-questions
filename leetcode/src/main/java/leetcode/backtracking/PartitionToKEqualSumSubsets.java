package leetcode.backtracking;

import java.util.Arrays;

public class PartitionToKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        
        if(sum % k != 0)
            return false;
        
        int targetSum = sum / k;
        int[] buckets = new int[k];
        Arrays.sort(nums);
        return helper(nums, nums.length - 1, buckets, targetSum);
    }
    
    private boolean helper(int[] nums, int index, int[] buckets, int targetSum) {
        if(index == -1)
            return true;
        
        for(int i = 0; i < buckets.length; i++) {
            if(nums[index] + buckets[i] <= targetSum) {
                buckets[i] += nums[index];
                if (helper(nums, index - 1, buckets, targetSum))
                    return true;
                buckets[i] -= nums[index];
            }
            if(buckets[i] == 0)
                break;
        }
        return false;
    }    
}
