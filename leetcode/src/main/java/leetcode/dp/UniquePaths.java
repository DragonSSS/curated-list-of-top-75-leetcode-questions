package leetcode.dp;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        Integer[][] memo = new Integer[m][n];
        return helper(m, n, 0, 0, memo);
    }

    private int helper(int m, int n, int curRow, int curCol, Integer[][] memo) {
        if (curRow >= m || curCol >= n)
            return 0;

        if (curRow == (m - 1) && curCol == (n - 1))
            return 1;

        if (memo[curRow][curCol] != null)
            return memo[curRow][curCol];

        int res = 0;

        res += helper(m, n, curRow + 1, curCol, memo);
        res += helper(m, n, curRow, curCol + 1, memo);
        memo[curRow][curCol] = res;

        return res;
    }

    int[][] dirs = new int[][]{{0, 1}, {1, 0}};
    Integer[][] memo;
    public int uniquePaths_2r(int m, int n) {
        memo = new Integer[m][n];
        return helper_2r(m, n, 0, 0);
    }
    
    private int helper_2r(int m, int n, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n)
            return 0;
        
        if(i == m - 1 && j == n - 1)
            return 1;
        
        if(memo[i][j] != null)
            return memo[i][j];
        
        int res = 0;
        
        for(int[] dir : dirs) {
            res += helper_2r(m, n, i + dir[0], j + dir[1]);
        }
        
        memo[i][j] = res;
        return res;
    }

    // int[][] dirs = new int[][]{{0, 1}, {1, 0}};
    // Integer[][] memo;
    public int uniquePaths_3r(int m, int n) {
        memo = new Integer[m][n];
        return helper_3r(0, 0, m, n);
    }
    
    private int helper_3r(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1)
            return 1;
        if ( i >= m || j >= n)
            return 0;
        
        if (memo[i][j] != null)
            return memo[i][j];
        
        int res = 0;
        for(int[] dir : dirs) {
            res += helper_3r(i + dir[0], j + dir[1], m, n);
        }
        
        memo[i][j] = res;
        return res;
    }

    public int uniquePaths_3r_dp(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] subarr : dp) {
            Arrays.fill(subarr, 1);
        }
        
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        return dp[m - 1][n - 1];
    }

    public int uniquePaths_4r_dp(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] arr : dp) {
            Arrays.fill(arr, 1);
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    // int[][] dirs = new int[][]{{0, 1}, {1, 0}};
    // Integer[][] memo;
    public int uniquePaths_4r_dfs(int m, int n) {
        memo = new Integer[m][n];
        return helper_4r(m, n, 0, 0);
    }

    private int helper_4r(int m, int n, int x, int y) {
        if (x >= m || y >= n) {
            return 0;
        } else if ((x == m - 1) && (y == n - 1)) {
            return 1;
        } else if (memo[x][y] != null) {
            return memo[x][y];
        }

        int res = 0;
        for(int[] dir : dirs) {
            res += helper_4r(m, n, x + dir[0], y + dir[1]);
        }

        memo[x][y] = res;
        return memo[x][y];
    }
}
