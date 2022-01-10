package leetcode.array;

public class MinimumSwapsToGroupAllOnesTogetherII {
    public int minSwaps(int[] nums) {
        int allOnes = 0, curOnes = 0, maxOnesInWindow = 0;
        for (int d : nums) {
            if (d == 1) allOnes++;
        }

        int[] duplicate = new int[nums.length * 2];
        for (int i = 0; i < nums.length * 2; i++) {
            duplicate[i] = nums[i % nums.length];
        }
        
        for (int i = 0; i < duplicate.length; i++) {
            if(i >= allOnes && duplicate[i - allOnes] == 1) {
                curOnes--;
            }
            
            if (duplicate[i] == 1) curOnes++;
            maxOnesInWindow = Math.max(curOnes, maxOnesInWindow);
        }
        
        return allOnes - maxOnesInWindow;
    }
}
