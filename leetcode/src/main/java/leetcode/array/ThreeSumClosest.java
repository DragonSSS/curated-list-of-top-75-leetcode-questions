package leetcode.array;

import java.util.Arrays;

public class ThreeSumClosest {
    // three pointers
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int dif = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return target;
                }
                int curDif = target - sum;
                if (Math.abs(curDif) < Math.abs(dif)) {
                    dif = curDif;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return target - dif;
    }    
}
