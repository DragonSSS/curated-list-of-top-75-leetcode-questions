package leetcode.dfs;

public class LongestIncreasingPathInMatrix {
    // 2,3,4
    // 6,6,9
    // 1,8,7
    // res -> 4 as 2,3,4,9
    int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        int[][] memo = new int[matrix.length][matrix[0].length];
        int finalRes = 0;
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                finalRes = Math.max(finalRes, helper(matrix, memo, i, j, -1));
            }
        }

        return finalRes;
    }

    // top-down
    private int helper(int[][] matrix, int[][] memo, int x, int y, int preVal) {
        // edge/bottom case
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || preVal >= matrix[x][y]) {
            return 0;
        }

        // chech memorization
        if (memo[x][y] != 0) {
            return memo[x][y];
        }
        

        // dfs, top-down
        int res = 0;
        for (int[] dir : dirs) {
            res = Math.max(res, helper(matrix, memo, x + dir[0], y + dir[1], matrix[x][y]));
        }
        res++;
        memo[x][y] = res;
        return res;
    }
}
