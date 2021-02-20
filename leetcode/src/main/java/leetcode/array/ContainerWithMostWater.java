package leetcode.array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;

        int res = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}
