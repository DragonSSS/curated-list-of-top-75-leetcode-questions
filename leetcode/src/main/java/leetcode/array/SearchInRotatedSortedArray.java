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

    public int search_3r(int[] nums, int target) {
        if(nums.length == 1)
            return nums[0] == target? 0 : -1;
        
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            // figure where is mid located
            if (nums[mid] >= nums[left]) {
                if (target > nums[mid] || target < nums[left]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target < nums[mid] || target > nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    public int search_4r(int[] nums, int target) {
        if (nums.length == 1)
            return nums[0] == target ? 0 : -1;
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            
            // right part
            if (nums[start] > nums[mid]) {
                if (nums[end] < target || nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                
            } else {
                // left part
                if (nums[start] > target || nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return -1;
    }

    public int search_5r(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            // mid index is located at left part
            if (nums[left] <= nums[mid]) {
                // compare value of left and mid index with target one
                if (nums[left] > target || target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                // mid index is located at right part
                // compare value of right and mid index with target one
                if (nums[right] < target || target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
