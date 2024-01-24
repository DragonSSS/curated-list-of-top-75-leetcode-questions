package leetcode.array;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int countOne = 0;
        int right = 0, left = 0;
        int res = 0;
        for(;right < nums.length; right++) {
            int cur = nums[right];
            if (cur == 1) {
                countOne++;
            }
            while (countOne + k < right - left + 1) {
                if(nums[left] == 1) {
                    countOne--;
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }    
}
