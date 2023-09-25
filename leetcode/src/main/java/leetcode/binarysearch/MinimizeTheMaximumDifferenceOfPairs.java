package leetcode.binarysearch;

import java.util.Arrays;

public class MinimizeTheMaximumDifferenceOfPairs {
   public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int size = nums.length;
        int left = 0, right = nums[size - 1] - nums[0];
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int pairs = 0;
            // 1, 0
            // 3, 2
            for(int i = 1; i < size && pairs < p; i++) {
                if (nums[i] - nums[i - 1] <= mid) {
                    pairs++;
                    i++; // move to new pair by i + 2
                }
            }

            if (pairs < p) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }    
}
