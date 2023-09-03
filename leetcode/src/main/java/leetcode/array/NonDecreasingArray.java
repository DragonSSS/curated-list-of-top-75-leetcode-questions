package leetcode.array;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length && count <= 1; i++) {
            // 4 4 or 4 5
            // 5 4
            if(nums[i - 1] > nums[i]) {
                count++;
                if (i - 2 < 0 || nums[i - 2] <= nums[i])
                    nums[i - 1] = nums[i];
                else
                    nums[i] =  nums[i - 1];
            }
        }
        return count <= 1;
    }
    
    public boolean checkPossibility_2r(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length && count <= 1; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                if (i == 1 || nums[i - 2] <= nums[i]) {
                    // 1, 4, 3
                    nums[i - 1] = nums[i];
                } else {
                    // 4, 5, 3  
                    nums[i] = nums[i - 1];
                }
            }
        }
        return count <= 1;
    }
}
