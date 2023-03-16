package leetcode.array;

import java.util.Arrays;

public class ArrayWithElementsNotEqualToAverageOfNeighbors {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length, left = 0, right = nums.length - 1;
        int[] res = new int[n];
        
        Arrays.sort(nums);
        int index = 0;
        
        // small, big, small, big
        while(left < right) {
            res[index++] = nums[left++];
            res[index++] = nums[right--];
        }
        
        // odd case
        if (left == right) {
            res[index++] = nums[left];
        }
        
        return res;
    }   
}
