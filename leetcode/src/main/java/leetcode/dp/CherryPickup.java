package leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class CherryPickup {
    public int cherryPickup(int[][] grid) {
        Map<String, Integer> memo = new HashMap<>();
        // if helper func return MIN_VALUE, it means cannot reach destination cell
        return Math.max(0, helper(0, 0, 0, 0, grid.length, grid[0].length, grid, memo));
    }

    // simulate two ppl collect cherries together to right-down corner cell
    private int helper(int i, int j, int m, int n, int row, int col, int[][] grid, Map<String, Integer> memo){
        // make sure we return MIN_VALUE instead of 0 to indicate the path is invalid, otherwise we will get cherries even two ppl cannot reach righ-down corner cell
        if(i > row - 1 || j > col - 1 || m > row - 1 || n > col - 1 || grid[i][j] == -1 || grid[m][n] == -1)
            return Integer.MIN_VALUE;

        String key = i + "-" + j + "-" + m + "-" + n;
        if(memo.containsKey(key))
            return memo.get(key);

        if(i == row - 1 && j == col - 1)
            return grid[i][j];
        if(m == row - 1 && n == col - 1)
            return grid[m][n];
        int res = (i == m && j == n) ? grid[i][j] : grid[i][j] + grid[m][n];

        res += Math.max(
                Math.max(
                        helper(i + 1, j, m + 1, n, row, col, grid, memo),
                        helper(i + 1, j, m, n + 1, row, col, grid, memo)),
                Math.max(
                        helper(i, j + 1, m + 1, n, row, col, grid, memo),
                        helper(i, j + 1, m, n + 1, row, col, grid, memo))
        );
        memo.put(key, res);
        return res;
    }

    Map<String, Integer> memo = new HashMap<>();
    public int cherryPickup_2r(int[][] grid) {
        return Math.max(0, helper_2r(0, 0, 0, 0, grid));
    }
    
    private int helper_2r(int i, int j, int m, int n, int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        if (i >= row || j >= col || m >= row || n >= col || grid[i][j] == -1 || grid[m][n] == -1)
            return Integer.MIN_VALUE;
        
        String key = i + "_" + j + "_" + m + "_" + n;
        
        if (memo.containsKey(key))
            return memo.get(key);
        
        if (i == row - 1 && j == col - 1)
            return grid[i][j];
        
        if (m == row - 1 && n == col - 1)
            return grid[m][n];
        
        int curRes = i == m && j == n? grid[i][j] : grid[i][j] + grid[m][n];
        
        curRes += Math.max(
            Math.max(helper_2r(i + 1, j, m + 1, n, grid), helper_2r(i, j + 1, m, n + 1, grid)),
            Math.max(helper_2r(i + 1, j, m, n + 1, grid), helper_2r(i, j + 1, m + 1, n, grid))
        );
        
        memo.put(key, curRes);
        return curRes;
    }
}
