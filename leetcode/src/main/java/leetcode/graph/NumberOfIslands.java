package leetcode.graph;

public class NumberOfIslands {
    private int[][] dirs = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int numIslands(char[][] grid) {
        int res = 0;
        if (grid == null || grid.length == 0)
            return res;

        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1' && !visited[i][j]){
                    res++;
                    helper(i, j, visited, grid);
                }
            }
        }

        return res;
    }

    private void helper(int i, int j, boolean[][] visited, char[][] grid) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1 || visited[i][j] || grid[i][j] == '0')
            return;

        visited[i][j] = true;

        for (int k = 0; k < dirs.length; k++) {
            helper(i + dirs[k][0], j + dirs[k][1], visited, grid);
        }
    }
}
