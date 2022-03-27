package leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bottom = row - 1;

        int left = 0;
        int right = col - 1;

        while(res.size() < row * col) {
            for(int i = left; i <= right && res.size() < row * col; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom && res.size() < row * col; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            for(int i = right; i >= left && res.size() < row * col; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i = bottom; i >= top && res.size() < row * col; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }

    public List<Integer> spiralOrder_2r(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m - 1;

        int left = 0;
        int right = n - 1;

        while(res.size() < m * n) {
            for(int i = left; i <= right && res.size() < m * n; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom && res.size() < m * n; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            for(int i = right; i >= left && res.size() < m * n; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i = bottom; i >= top && res.size() < m * n; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
