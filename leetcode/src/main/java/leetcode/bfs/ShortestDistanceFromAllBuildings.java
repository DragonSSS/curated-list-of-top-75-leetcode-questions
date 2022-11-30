package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceFromAllBuildings {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    int[][] distance;
    int[][] reachCount;
    public int shortestDistance(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        distance = new int[m][n];
        reachCount = new int[m][n];
        int buildingCount = 0;
        for(int i = 0; i < m; i++)  {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    helper(i, j, grid);
                    buildingCount++;
                }
            }
        }
        
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (reachCount[i][j] == buildingCount) {
                    res = Math.min(res, distance[i][j]);
                }
            }
        }
        
        return res == Integer.MAX_VALUE? -1 : res;
    }
    
    private void helper(int i, int j, int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        int curDistance = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int k = 0; k < size; k++) {
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];
                for(int[] dir : dirs) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];
                    if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length || visited[newX][newY] || grid[newX][newY] != 0)
                        continue;
                    reachCount[newX][newY]++;
                    distance[newX][newY]+=curDistance;
                    visited[newX][newY] = true;
                    queue.offer(new int[]{newX, newY});
                }
                
            }
            curDistance++;
        }
    }    
}
