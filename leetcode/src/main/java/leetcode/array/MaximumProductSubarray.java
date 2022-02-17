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

    public int maxProduct_2r(int[] nums) {
        int[] minDp = new int[nums.length];
        int[] maxDp = new int[nums.length];
        
        minDp[0] = nums[0];
        maxDp[0] = nums[0];
        int res = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++) {
           minDp[i] = Math.min(Math.min(minDp[i - 1] * nums[i], maxDp[i - 1] * nums[i]), nums[i]);
           maxDp[i] = Math.max(Math.max(minDp[i - 1] * nums[i], maxDp[i - 1] * nums[i]), nums[i]);
            res = Math.max(res, maxDp[i]);
        }
        res = Math.max(res, maxDp[0]);
        
        return res;
    }
}
