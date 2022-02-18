package leetcode.array;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        // edge case
        if (nums.length == 1)
            return nums[0] == target? 0 : -1;

        int len = nums.length;
        int start = 0;
        int end = len - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[start] <= nums[mid]) {
                if (target > nums[mid] || target < nums[start]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < nums[mid] || target > nums[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public int search_2r(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target)
                return mid;
            
            //left sorted
            if (nums[mid] >= nums[start]) {
                if(target > nums[mid] || target < nums[start]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            // right sorted
            } else {
                if(target < nums[mid] || target > nums[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return -1;
    }
}
