package leetcode.dp;

public class WhereWillTheBallFall {
    // stuck cases
    // [i, j] = 1, [i + 1, j] = -1 (have to be pre:1, next:1)
    // [i, j] = -1, [i, j - 1] = 1 (have to be pre:-1, next:-1)
    // dfs
    public int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];
        for(int col = 0; col < grid[0].length; col++) {
            res[col] = helper(grid, 0, col);
        }
        return res;
    }

    private int helper(int[][] grid, int i, int j) {
        if (i == grid.length) {
            return j;
        }

        if (j < 0 || j >= grid[0].length) {
            return -1;
        }

        if (grid[i][j] == -1 && j - 1 >= 0 && grid[i][j - 1] == -1) {
            return helper(grid, i + 1, j - 1);
        } else if (grid[i][j] == 1 && j + 1 < grid[0].length && grid[i][j + 1] == 1) {
            return helper(grid, i + 1, j + 1);
        }

        return -1;        
    }    
}
