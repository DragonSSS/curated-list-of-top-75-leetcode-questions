package leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

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
                    // helper_bfs(i, j, visited, grid);
                }
            }
        }

        return res;
    }

    // dfs_version
    private void helper(int i, int j, boolean[][] visited, char[][] grid) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1 || visited[i][j] || grid[i][j] == '0')
            return;

        visited[i][j] = true;

        for (int k = 0; k < dirs.length; k++) {
            helper(i + dirs[k][0], j + dirs[k][1], visited, grid);
        }
    }

    // bfs_version
    private void helper_bfs(int i, int j, boolean[][] visited, char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int k = 0; k < size; k++) {
                int[] cur = queue.poll();
                for (int[] dir : dirs) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != '1' || visited[x][y]) {
                        continue;
                    }

                    visited[x][y] = true;
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }
}
