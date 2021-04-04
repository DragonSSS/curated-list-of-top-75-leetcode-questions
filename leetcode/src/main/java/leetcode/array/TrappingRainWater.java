package leetcode.array;

public class TrappingRainWater {
    public int trap(int[] height) {
        // edge case
        if (height.length == 0)
            return 0;

        int leftMax = 0, rightMax = 0;
        int res = 0;
        int i = 0, j = height.length - 1;

        // two pointers or you can use two arrays to record leftMax and rightMax
        while(i < j) {
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);

            if(leftMax < rightMax) {
                res += leftMax - height[i];
                i++;
            } else {
                res += rightMax - height[j];
                j--;
            }
        }

        return res;
    }
}
