package leetcode.array;

public class MaximumLengthOfSubarrayWithPositiveProduct {
    public int getMaxLen(int[] nums) {
        int max = 0;
        int zeroIndex = -1;
        int negativeIndex = -1;
        int totalNegative = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                totalNegative++;
                if (negativeIndex == -1) {
                    negativeIndex = i;
                }
            } 
            
            if (nums[i] == 0) {
                zeroIndex = i;
                negativeIndex = -1;
                totalNegative = 0;
            } else {
                if (totalNegative % 2 == 0) {
                    max = Math.max(max, i - zeroIndex);
                } else {
                    max = Math.max(max, i - negativeIndex);
                }
            }
        }

        return max;
    }
}
