package leetcode.dp;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] memo = new int[row][col];

        return helper(grid, row - 1, col - 1, memo);
    }

    private int helper(int[][] grid, int row, int col, int[][] memo) {
        // exit condition
        if (row == 0 && col == 0)
            return grid[0][0];

        // boundary condition
        if (row == 0) {
            return grid[row][col] + helper(grid, row, col - 1, memo);
        }

        if (col == 0) {
            return grid[row][col] + helper(grid, row - 1, col, memo);
        }

        // check memorization
        if (memo[row][col] != 0) {
            return memo[row][col];
        }

        memo[row][col] = grid[row][col] + Math.min(helper(grid, row, col - 1, memo), helper(grid, row - 1, col, memo));

        return memo[row][col];
    }
}
