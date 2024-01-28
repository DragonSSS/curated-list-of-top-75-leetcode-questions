package leetcode.dfs;

public class OutOfBoundaryPaths {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    Integer[][][] memo;
    int sizeRow, sizeCol;
    int moduloVal = (int) Math.pow(10, 9) + 7;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        sizeRow = m;
        sizeCol = n;
        memo = new Integer[m][n][51];
        return helper(startRow, startColumn, maxMove);
    }

    private int helper(int i, int j, int maxMove) {
        if (i < 0 || i == sizeRow || j < 0 || j == sizeCol) {
            return 1;
        }

        if (memo[i][j][maxMove] != null) {
            return memo[i][j][maxMove];
        }

        if (maxMove == 0) {
            return 0;
        }

        int curRes = 0;
        for(int[] dir : dirs) {
            curRes = (curRes + helper(i + dir[0], j + dir[1], maxMove - 1)) % moduloVal;
        }

        memo[i][j][maxMove] = curRes;
        return curRes;
    }    
}
