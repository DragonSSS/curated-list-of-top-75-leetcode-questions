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
}
