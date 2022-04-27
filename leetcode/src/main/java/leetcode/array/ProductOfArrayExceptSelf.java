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

    public int[] productExceptSelf_2r(int[] nums) {
        int[] leftPrefixProduct = new int[nums.length];
        int[] rightPrefixProduct = new int[nums.length];
        
        leftPrefixProduct[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            leftPrefixProduct[i] = leftPrefixProduct[i - 1] * nums[i - 1];
        }
        
        rightPrefixProduct[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            rightPrefixProduct[i] = rightPrefixProduct[i + 1] * nums[i + 1];
        }
        
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = leftPrefixProduct[i] * rightPrefixProduct[i];
        }
        
        return res;
    }
}
