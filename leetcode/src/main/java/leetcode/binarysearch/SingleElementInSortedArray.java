package leetcode.binarysearch;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        
        if (nums[0] != nums[1])
            return nums[0];
        
        if (nums[nums.length - 2] != nums[nums.length - 1])
            return nums[nums.length - 1];
        
        int start = 0;
        int end = nums.length - 1;
        
        
        // end = 8
        // mid = 4
        // [1,1,2,2,   4,     4,5,8,8]
        
        
        // end = 8
        // mid = 4
        // [1,1,2,3,   3,   4,4,8,8]
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            boolean rightHalfEven = (end - mid) % 2 == 0;
            if (nums[mid] == nums[mid + 1]) {
                if (rightHalfEven) {
                    start = mid + 2;
                } else {
                    end = mid - 1;
                }
            } else if (nums[mid] == nums[mid - 1]) {
                
                if (rightHalfEven) {
                    end = mid - 2;
                } else {
                    start = mid + 1;
                }
                
            } else {
                return nums[mid];
            }
            
        }
        
        return -1;
    }
}
