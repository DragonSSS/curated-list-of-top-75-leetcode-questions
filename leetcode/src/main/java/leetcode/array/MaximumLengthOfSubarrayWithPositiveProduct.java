package leetcode.array;

public class MaximumLengthOfSubarrayWithPositiveProduct {
    public int getMaxLen(int[] nums) {
        int max = 0;
        int zeroIndex = -1;
        int negativeIndex = -1;
        int totalNegative = 0;

        for (int i = 0; i < nums.length; i++) {
            // if num is negative, we update total negative and record first negative index
            if (nums[i] < 0) {
                totalNegative++;
                if (negativeIndex == -1) {
                    negativeIndex = i;
                }
            } 
            
            // recourd zero index and reset negativeIndex and totalNegative
            if (nums[i] == 0) {
                zeroIndex = i;
                negativeIndex = -1;
                totalNegative = 0;
            } else {
                // we only care latest zero index position
                if (totalNegative % 2 == 0) {
                    max = Math.max(max, i - zeroIndex);
                } else {
                    // exclude current negative index, only care first negative index
                    max = Math.max(max, i - negativeIndex);
                }
            }
        }

        return max;
    }
}
