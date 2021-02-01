package leetcode.array;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums.length == 0)
            return 0;

        // 3 4 5 1 2
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }
}
