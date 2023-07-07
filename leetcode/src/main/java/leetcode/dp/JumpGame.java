package leetcode.dp;

public class JumpGame {
    // greedy
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > max)
                return false;
            max = Math.max(max, nums[i] + i);
        }

        return true;
    }

    // reverse way
    public boolean canJumpReverse(int[] nums) {
        int lastIndex = nums.length - 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] + i >= lastIndex)
                lastIndex = i;
        }

        return lastIndex == 0;
    }

    Integer[] memo;
    public boolean canJump_2r(int[] nums) {
        memo = new Integer[nums.length];
        return helper_2r(nums, 0);
    }
    
    private boolean helper_2r(int[] nums, int index) {
        if (index >= nums.length - 1)
            return true;
        
        int rangeMax = nums[index];
        if(memo[index] != null)
            return memo[index] == 1;
        
        for(int i = rangeMax; i >= 1; i--) {
            if (helper_2r(nums, index + i)) {
                memo[index] = 1;
                return true;
            }   
        }
        
        memo[index] = 0;
        return false;
    }

    public boolean canJump_3r(int[] nums) {
        int curIndex = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= curIndex) {
                curIndex = i;
            }
        }
        
        return curIndex == 0;
    }

    public boolean canJump_4r(int[] nums) {
        int curIndex = nums.length - 1;
        for(int i = nums.length - 1; i >=0; i--) {
            if (i + nums[i] >= curIndex) {
                curIndex = i;
            }
        }
        return curIndex == 0;
    }
}
