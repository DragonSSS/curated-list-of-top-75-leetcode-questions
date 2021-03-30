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
}
