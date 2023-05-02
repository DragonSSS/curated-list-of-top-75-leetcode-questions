package leetcode.binarysearch;

public class Search2dMatrix {
    // binary search
    // row = 3
    // col = 4
    // total = 12
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int row = matrix.length;
        int left = 0;
        int right = col * row - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int cur = matrix[mid / col][mid % col];
            if(cur == target) {
                return true;
            } else if (cur > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public boolean searchMatrix_2r(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int val = matrix[mid / n][mid % n];
            if (val == target) {
                return true;
            } else if (val > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
