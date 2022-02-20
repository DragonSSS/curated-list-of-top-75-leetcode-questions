package leetcode.binary;

import java.util.Arrays;

public class MissingNumber {
    // n , [0, n] and missing one value;
    // [0, 1, 3] missing 2
    // index: 0, 1, 2

    // [0, 1]
    // index: 0, 1
    // missing 2
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i = 0; i < nums.length; i++) {
            res = res ^ i ^ nums[i];
        }
        return res;
    }

    // [0, 1, 3]
    // [0, 1, 3, 4, 5, 6, 7]
    public int missingNumberByBinarySearch(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] > mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int missingNumber_2r(int[] nums) {
        int res = nums.length;
        for(int i = 0; i < nums.length; i++) {
            res ^= nums[i] ^ i;
        }
        return res;
    }
}
