package leetcode.array;

public class TrappingRainWater {

    public int trap(int[] height) {
        if (height.length == 0)  
            return 0;  
          
        int i, max, total = 0;
        int left[] = new int[height.length];
        int right[] = new int[height.length];  
  
        // from left to right
        left[0] = height[0];
        max = height[0];
        for (i = 1; i < height.length; i++) {  
            left[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }  
  
        // from right to left
        right[height.length-1] = height[height.length-1];
        max = height[height.length-1];
        for (i = height.length-2; i >= 0; i--) {  
            right[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }  
  
        // trapped water (when i==0 and i == height.length - 1, it cannot trapped any water)
        for (i = 1; i < height.length-1; i++) {  
            int bit = Math.min(left[i], right[i]) - height[i];
            // bit >= 0 as max include height[i] itself
            total += bit;  
        }  
  
        return total;  
    }

    public int trap_improve_version(int[] height) {
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

    public int trap_2r(int[] height) {
        int size = height.length;
        int[] left = new int[size];
        int[] right = new int[size];

        int max = height[0];
        left[0] = height[0];
        for(int i = 1; i < size; i++) {
            left[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }

        right[size - 1] = height[size - 1];
        max = height[size - 1];
        for(int i = size - 2; i >= 0; i--) {
            right[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }

        int res = 0;
        for(int i = 1; i < size - 1; i++) {
            res += Math.min(left[i], right[i]) - height[i];
        }
        return res;
    }
}
