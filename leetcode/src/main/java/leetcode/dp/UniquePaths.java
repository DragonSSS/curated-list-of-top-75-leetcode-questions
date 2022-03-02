package leetcode.dp;

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
}
