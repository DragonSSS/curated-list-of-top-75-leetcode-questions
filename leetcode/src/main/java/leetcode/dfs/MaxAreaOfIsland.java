package leetcode.dfs;

public class MaxAreaOfIsland {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int max = 0;
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    int cur = helper(grid, visited, i, j);
                    max = Math.max(max, cur);
                }
            }
        }
        return max;
    }
    
    private int helper(int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == 0)
            return 0;
        visited[i][j] = true;
        int cur = 1;
        
        for(int[] dir : dirs) {
            cur += helper(grid, visited, i + dir[0], j + dir[1]);
        }
        return cur;
    }
}
