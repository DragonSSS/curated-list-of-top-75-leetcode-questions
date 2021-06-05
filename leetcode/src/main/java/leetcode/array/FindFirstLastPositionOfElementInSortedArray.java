package leetcode.array;

public class FindFirstLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return new int[]{ -1, -1};

        int firstIndex = findFirstIndex(nums, target);
        int lastIndex = findLastIndex(nums, target);

        return new int[]{firstIndex, lastIndex};
    }


    private int findFirstIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if(nums[mid] == target) index = mid;
        }

        return index;
    }

    private int findLastIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target) {
                start = mid + 1;
            } else {
                end= mid - 1;
            }

            if(nums[mid] == target) index = mid;
        }

        return index;
    }
}
