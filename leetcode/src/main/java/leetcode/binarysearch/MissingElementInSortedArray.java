package leetcode.binarysearch;

public class MissingElementInSortedArray {
    // 4, 7, 9, 10. -> 5, 6, 8
    // 10 - 4 = 6
    // left = 0, right = 3
    public int missingElement(int[] nums, int k) {
        int left = 0, right = nums.length - 1;

        int missed = nums[right] - nums[left] - (right - left);
        if (missed < k) {
            return nums[right] + k - missed;
        }

        while(left < right - 1) { // avoid infinite loop: left < right
            int mid =  left + (right - left) / 2;
            missed = nums[mid] - nums[left] - (mid - left);
            if (k > missed) {
                k -= missed;
                left = mid;
            } else {
                right = mid;
            }
        }
        return nums[left] + k;
    }

    public int missingElement_iteration(int[] nums, int k) {
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            int missed = nums[i] - nums[i - 1] - 1;
            if (missed >= k) {
                return nums[i - 1] + k;
            }
            k -= missed;
        }
        return nums[n - 1] + k;
    }
}
