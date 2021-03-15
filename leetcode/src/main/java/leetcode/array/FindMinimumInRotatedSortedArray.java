package leetcode.array;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        // edge case
        int len = nums.length;
        if (nums[0] <= nums[len - 1])
            return nums[0];

        int start = 0;
        int end = len - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }
}
