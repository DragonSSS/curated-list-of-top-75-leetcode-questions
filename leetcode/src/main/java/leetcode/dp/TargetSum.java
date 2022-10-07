package leetcode.dp;

import java.util.HashMap;
import java.util.Map;

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

    Map<String, Integer> memo;
    public int findTargetSumWays_2r(int[] nums, int target) {
        memo = new HashMap<>();
        return helper_2r(nums, target, 0);
    }
    
    private int helper_2r(int[] nums, int target, int index) {
        String curKey = createKey(target, index);
        
        if (memo.containsKey(curKey))
            return memo.get(curKey);
        
        if (index == nums.length) {
             return target == 0 ? 1 : 0;
        }
        
        int curRes = helper_2r(nums, target + nums[index], index + 1) + helper_2r(nums, target - nums[index], index + 1);
        
        memo.put(curKey, curRes);
        return curRes;
    }
    
    private String createKey(int target, int index) {
        return index + ":" + target;
    }
}
