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
}
