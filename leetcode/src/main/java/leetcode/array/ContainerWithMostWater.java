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

    public int maxArea_2r(int[] height) {
        int res = 0;
        int start = 0, end = height.length - 1;
        while(start < end) {
            res = Math.max(res, (end - start) * Math.min(height[start], height[end]));
            
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        
        return res;
    }

    public int maxArea_3r(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;
        while(left < right) {
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }
}
