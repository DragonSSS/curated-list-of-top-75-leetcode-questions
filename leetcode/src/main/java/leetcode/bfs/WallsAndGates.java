package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        int n = rooms[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (rooms[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];
                
                for(int[] dir : directions) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];
                    
                    if (newX < 0 || newX >= m || newY < 0 || newY >= n || rooms[newX][newY] != Integer.MAX_VALUE) {
                        continue;
                    }
                    
                    rooms[newX][newY] = rooms[x][y] + 1;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }
    }    
}
