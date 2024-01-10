package leetcode.array;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;
        int left = 0;
        long curSum = 0;
        for(int right = 0; right < nums.length; right++) {
            int mostRight = nums[right];
            curSum += mostRight;
            while((long)(right - left + 1) * mostRight - k > curSum) {
                curSum -= nums[left];
                left++;
            }
            res = Math.max(res, (right - left + 1));
        }
        return res;
    }    
}
