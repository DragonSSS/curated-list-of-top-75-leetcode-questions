package leetcode.binarysearch;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            // arr[mid] = 5
            // mid = 1, mid + 1 = 2
            // 5 - 2 = 3
            // 1, 5
            // 1, 2, 3, 4, 5
            if (arr[mid] - (mid + 1) >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left + k;
    }
}
