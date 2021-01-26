package leetcode.dp;

public class RangeSumQuery2D {
    private int[][] sums;

    public RangeSumQuery2D(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return;
        int m = matrix.length;
        int n = matrix[0].length;

        sums = new int[m + 1][n + 1];

        for (int i = 1; i <=m; i++) {
            for(int j = 1; j <= n; j++) {
                sums[i][j] = sums[i - 1][j] + sums[i][j - 1] + matrix[i - 1][j - 1] - sums[i - 1][j - 1];             // sums[0][0] = 0;
                // sums[1][1] = sums[0][1] + sums[1][0] + matrix[0][0] - sums[0][0];
                // sums[2][2] = sums[1][2] + sums[2][1] + matrix[1][1] - sums[1][1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        // convert index to row and column
        return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1] - sums[row2 + 1][col1] + sums[row1][col1];
    }
}
