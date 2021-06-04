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
        return -1;
    }

    private int findLastIndex(int[] nums, int target) {
        return -1;
    }
}
