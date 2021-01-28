package leetcode.array;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        if(nums.length == 0)
            return res;

        //prefix product
        res[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;

        for(int i = nums.length - 1; i >=0; i--) {
            res[i] = res[i] * right;
            right = right * nums[i];
        }

        return res;
    }
}
