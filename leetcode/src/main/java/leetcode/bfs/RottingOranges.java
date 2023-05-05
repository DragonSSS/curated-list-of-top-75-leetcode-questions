package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        
        int mins = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            boolean flag = false;
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                for(int[] dir : dirs) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != 1)
                        continue;
                    
                    grid[x][y] = 2;
                    if(!flag)
                        mins++;
                    flag = true;
                    queue.offer(new int[]{x, y});
                }
            }
        }
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        
        return mins;
    }

    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int orangesRotting_2r(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int refresh = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }

                if(grid[i][j] == 1) {
                    refresh++;
                }
            }
        }

        // edge cause
        if (refresh == 0) {
            return 0;
        }

        int res = 0;
        // if not refresh left, we don't need to last scan even queue is not empty
        while(!queue.isEmpty() && refresh > 0) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                
                for(int[] dir : dirs) {
                    int x = dir[0] + cur[0];
                    int y = dir[1] + cur[1];

                    if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != 1) {
                        continue;
                    }

                    queue.offer(new int[]{x, y});
                    refresh--;
                    grid[x][y] = 2;
                }
            }
            res++;
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return res;
    }
}
