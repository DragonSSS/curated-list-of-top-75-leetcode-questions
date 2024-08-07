package leetcode.greedy;

public class FindValidMatrixGivenRowAndColumnSums {
    // rowSum[3, 8]
    // colSum[4, 7]
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;

        int[] curRowSum = new int[n];
        int[] curColSum = new int[m];

        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                res[i][j] = Math.min(
                    rowSum[i] - curRowSum[i],
                    colSum[j] - curColSum[j]
                );
                curRowSum[i] += res[i][j];
                curColSum[j] += res[i][j];
            }
        }
        return res;
    }    
}
