package leetcode.array;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((mid == 0 || nums[mid - 1] < nums[mid]) && (mid == n - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            }

            if (mid == 0 || nums[mid-1] < nums[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
