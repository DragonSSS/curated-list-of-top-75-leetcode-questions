package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathToGetFood {
    int[][] dirs = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}};
    public int getFood(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (grid[i][j] == '*') {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                if (grid[cur[0]][cur[1]] == '#')
                    return count;
                for(int dir[] : dirs) {
                    int nextI = cur[0] + dir[0];
                    int nextJ = cur[1] + dir[1];
                    if (nextI < 0 || nextI >= n || nextJ < 0 || nextJ >= m || visited[nextI][nextJ] || grid[nextI][nextJ] == 'X') {
                        continue;
                    }
                    visited[nextI][nextJ] = true;
                    queue.offer(new int[]{nextI, nextJ});
                }
            }
            count++;
        }
        
        return -1;
    }
}
