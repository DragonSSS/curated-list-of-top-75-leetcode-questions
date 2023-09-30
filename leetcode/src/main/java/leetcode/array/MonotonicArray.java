package leetcode.array;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean increase = true, decrease = true;
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                decrease = false;
            }

            if (nums[i] > nums[i + 1]) {
                increase = false;
            }
        }
        return increase || decrease;
    }    
}
