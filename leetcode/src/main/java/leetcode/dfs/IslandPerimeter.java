package leetcode.dfs;

public class IslandPerimeter {
    int[][] dirs = new int[][]{{1,0}, {0,1}, {-1, 0}, {0, -1}};
    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return helper(grid, i, j, visited);
                }
            }
        }
        return 0;
    }

    private int helper(int[][] grid, int x, int y, boolean[][] visited) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) {
            return 1;
        }

        if (visited[x][y]) {
            return 0;
        }

        visited[x][y] = true;
        int res = 0;
        for(int[] dir : dirs) {
            res += helper(grid, x + dir[0], y + dir[1], visited);
        }
        return res;
    }
}
