package leetcode.array;

import java.util.Arrays;

public class ArrayWithElementsNotEqualToAverageOfNeighbors {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length, left = 0, right = nums.length - 1, res = 0;
        int[] pows = new int[n];
        int mod = (int)1e9 + 7;
        
        pows[0] = 1;
        for(int i = 1; i < n; i++) {
            pows[i] = (pows[i - 1] * 2) % mod;
        }
        
        Arrays.sort(nums);
        while(left <= right) {
           if (nums[left] + nums[right] > target) {
               right--;
           } else {
               res = (res + pows[right - left]) % mod;
               left++;
           }
        }
        return res;
    }    
}
