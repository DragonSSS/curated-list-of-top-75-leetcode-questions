package leetcode.array;

public class SortColors {
    // red 0
    // white 1
    // blue 2
    // 2 0 1 -> 0 1 2
    // 1 0 2
    // 0 1 2
    public void sortColors(int[] nums) {
        int curIndex = 0, zeroIndex = 0, twoIndex = nums.length - 1;
        // <= is used to cover the case that the middle index could be zero
        while(curIndex <= twoIndex) {
            if(nums[curIndex] == 0) {
                swap(curIndex, zeroIndex, nums);
                curIndex++;
                zeroIndex++;
            } else if(nums[curIndex] == 2) {
                swap(curIndex, twoIndex, nums);
                twoIndex--;
            } else {
                curIndex++;
            }
        }
    }
    
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }    
}
