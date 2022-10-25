package leetcode.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ShortestPathInGridWithObstaclesElimination {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        Set<String> visited = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, k});
        visited.add(getVisitedKey(0, 0, k));
        int res = 0;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];
                int curK = cur[2];
                
                if (x == m - 1 && y == n - 1)
                    return res;
                
                for(int[] dir : dirs) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];
                    if (newX < 0 || newX >= m || newY < 0 || newY >= n)
                        continue;
                    int newK = curK - grid[newX][newY];
                    if (newK < 0 || visited.contains(getVisitedKey(newX, newY, newK)))
                        continue;
                    queue.offer(new int[]{newX, newY, newK});
                    visited.add(getVisitedKey(newX, newY, newK));
                }
            }
            res++;
        }
        return -1;
    }
    private String getVisitedKey(int i, int j, int k) {
        return i + "-" + j + "-" + k;
    }    
}
