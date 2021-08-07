package leetcode.array;

public class FindPeakElement {
    public int findPeakElement_linearScan(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }

        return nums.length - 1;
    }

    public int findPeakElement_binarySearch(int[] nums) {
        int n = nums.length;
        int start = 0, end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // condition: nums[i] != nums[i + 1] for all valid i
            // peak is at range [mid + 1, n - 1]
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            // peak is at range [0, mid]
            } else {
                end = mid;
            }
        }

        return start;
    }
}
