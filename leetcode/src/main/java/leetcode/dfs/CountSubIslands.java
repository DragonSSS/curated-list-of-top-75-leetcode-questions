package leetcode.dfs;

public class CountSubIslands {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length, n = grid2[0].length;
        int res = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (grid2[i][j] == 1 && helper(grid1, grid2, i, j)){
                    res++;
                }
            }
        }
        return res;
    }
    
    private boolean helper(int[][] grid1, int[][] grid2, int i, int j) {
        if ( i < 0 || i >= grid2.length || j < 0 || j >= grid2[0].length || grid2[i][j] == 0)
            return true;
        
        if (grid1[i][j] == 0)
            return false;
        
        // Mark as visited
        grid2[i][j] = 0;
        
        boolean res = true;
        for(int[] dir : dirs) {
            res &= helper(grid1, grid2, i + dir[0], j + dir[1]);
        }
        return res;
    }

    int ans;
    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int countSubIslands_2r(int[][] grid1, int[][] grid2) {
        int m = grid2.length, n = grid2[0].length;
        int res = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (grid2[i][j] == 1){
                    ans = 1;
                    // dfs
                    helper_2r(grid1, grid2, i, j);
                    res += ans;
                }
            }
        }
        return res;
    }

    private void helper_2r(int[][] grid1, int[][] grid2, int i, int j) {
        if ( i < 0 || i >= grid2.length || j < 0 || j >= grid2[0].length || grid2[i][j] == 0)
            return;
        
        if (grid1[i][j] == 0) {
            ans = 0;
            return;
        }

        // Mark as visited
        grid2[i][j] = 0;
        for(int[] dir : dirs) {
            helper_2r(grid1, grid2, i + dir[0], j + dir[1]);
        }
    }
}
