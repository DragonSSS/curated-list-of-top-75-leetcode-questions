package leetcode.array;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if(nums.length == 0)
            return 0;

        int res = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int temp = curMax;
            curMax = Math.max(Math.max(curMax*nums[i], curMin*nums[i]), nums[i]);
            curMin = Math.min(Math.min(temp*nums[i], curMin*nums[i]), nums[i]);
            res = Math.max(curMax, res);
        }

        return res;
    }
}
