package leetcode.matrix;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;

        for(int i = 0; i <= row / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[row - i];
            matrix[row - i] = temp;
        }

        for(int i = 0; i <= row; i++) {
            for(int j = i; j <= col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void rotate_2r(int[][] matrix) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        for(int i = 0; i <=  n / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n - i];
            matrix[n - i] = temp;
        }
        
        for(int i = 0; i <= m; i++) {
            for(int j = i; j <= n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
