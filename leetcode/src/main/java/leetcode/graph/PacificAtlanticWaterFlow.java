package leetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {
    private int[][] dirs = new int[][]{{0,1}, {1,0}, {-1,0}, {0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return res;

        int row = matrix.length;
        int col = matrix[0].length;

        boolean[][] pac = new boolean[row][col];
        boolean[][] alt = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            helper(i, 0, Integer.MIN_VALUE, matrix, pac);
            helper(i, col - 1, Integer.MIN_VALUE, matrix, alt);
        }

        for (int i = 0; i < col; i++) {
            helper(0, i, Integer.MIN_VALUE, matrix, pac);
            helper(row - 1, i, Integer.MIN_VALUE, matrix, alt);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (pac[i][j] && alt[i][j])
                    res.add(Arrays.asList(i, j));
            }
        }
        return res;

    }

    private void helper(int i, int j, int pre, int[][] matrix, boolean[][] visited) {
        if (i < 0 || j < 0 || i > matrix.length - 1 || j > matrix[0].length - 1 || visited[i][j] || matrix[i][j] < pre)
            return;

        visited[i][j] = true;

        for(int k = 0; k < dirs.length; k++){
            helper(i + dirs[k][0], j + dirs[k][1], matrix[i][j], matrix, visited);
        }
    }

    public List<List<Integer>> pacificAtlantic_2r_dfs(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        
        int m = heights.length;
        int n = heights[0].length;
        
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        
        for(int i = 0; i < n; i++) {
            helper_2r_dfs(0, i, Integer.MIN_VALUE, heights, pacific);
            helper_2r_dfs(m - 1, i, Integer.MIN_VALUE, heights, atlantic);
        }
        
        for(int i = 0; i < m; i++) {
            helper_2r_dfs(i, 0, Integer.MIN_VALUE, heights, pacific);
            helper_2r_dfs(i, n - 1, Integer.MIN_VALUE, heights, atlantic);
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }
    
    private void helper_2r_dfs(int i, int j, int pre, int[][] ocean, boolean[][] visited) {
        if (i < 0 || i >= ocean.length || j < 0 || j >= ocean[0].length || visited[i][j] || pre > ocean[i][j])
            return;
        
        visited[i][j] = true;
        
        for(int[] dir : dirs) {
            helper_2r_dfs(i + dir[0], j + dir[1], ocean[i][j], ocean, visited);
        }
        
        return;
    }
}
