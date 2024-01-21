package leetcode.array;

public class LongestSubarrayOfOneAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int countZero = 0;
        int right = 0, left = 0;
        int res = 0;
        for(;right < nums.length; right++) {
            if (nums[right] == 0) {
                countZero++;
            }

            while(countZero > 1) {
                if (nums[left] == 0) {
                    countZero--;
                }
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }    
}
