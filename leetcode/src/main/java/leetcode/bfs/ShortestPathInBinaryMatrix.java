package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {
    int[][] dirs = new int[][]{
        {-1, 0}, {0, -1}, {1, 0}, {0, 1},
        {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
    };
    boolean[][] visited;
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        visited = new boolean[n][n];
        int res = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        
        // edge case
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                if (cur[0] == n - 1 && cur[1] == n - 1) {
                    return res;
                }
                
                for(int[] dir : dirs) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    
                    if (x < 0 || x >= n || y < 0 || y >= n || visited[x][y] || grid[x][y] == 1) {
                        continue;
                    }
                    queue.offer(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
            res++;
        }
        return -1;
    }    
}
