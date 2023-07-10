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

    int[][] memo;
    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int longestIncreasingPath_2r(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        memo = new int[m][n];
        int res = 1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                res = Math.max(res, helper_2r(matrix, i, j, -1));
            }
        }
        return res;
    }
    
    private int helper_2r(int[][] matrix, int i, int j, int preVal) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] <= preVal)
            return 0;
        
        if (memo[i][j] != 0)
            return memo[i][j];
        
        int curRes = 0;
        for (int[] dir : dirs) {
            curRes = Math.max(curRes, helper_2r(matrix, i + dir[0], j + dir[1], matrix[i][j]));
        }
        
        memo[i][j] = curRes + 1;
        return memo[i][j];
    }

    // dfs + recursion + memorization
    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    // int[][] memo;
    public int longestIncreasingPath_3r(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        memo = new int[m][n];
        int res = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                res = Math.max(res, helper_3r(matrix, i, j, -1));
            }
        }
        return res;
    }

    private int helper_3r(int[][] matrix, int i, int j, int pre) {
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] <= pre) {
            return 0;
        }

        if (memo[i][j] != 0) {
            return memo[i][j];
        }

        int cur = 0;
        for(int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            cur = Math.max(cur, helper_3r(matrix, x, y, matrix[i][j]) + 1);
        }

        memo[i][j] = cur;
        return memo[i][j];
    }
}
