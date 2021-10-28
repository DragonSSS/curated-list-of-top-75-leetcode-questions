package leetcode.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    // dfs + bfs
    // 1,0,0,0,1
    // 1,0,0,0,1
    // 1,0,0,0,1
    // 1,0,0,0,1
    // res = 3
    int[][] dirs = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}};
    public int shortestBridge(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        // find one island by dfs, then break
        boolean found = false;
        for (int i = 0; i < m && !found; i++) {
            for (int j = 0; j < n && !found; j++) {
                if (grid[i][j] == 1) {
                    helper(grid, visited, i, j, queue);
                    found = true;
                }
            }
        }

        // find shortest path by bfs
        int step = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                for (int[] dir : dirs) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y]) {
                        if (grid[x][y] == 1) return step;
                        visited[x][y] = true;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
            step++;
        }
        return -1;
    }

    private void helper(int[][] grid, boolean[][] visited, int i, int j, Queue<int[]> queue) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == 0) return;
        visited[i][j] = true;
        queue.offer(new int[]{i, j});
        for (int[] dir : dirs) {
            helper(grid, visited, i + dir[0], j + dir[1], queue);
        }
    }
}
