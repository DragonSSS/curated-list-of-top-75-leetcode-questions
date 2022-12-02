package leetcode.heap;

import java.util.PriorityQueue;

public class PathWithMinimumEffort {
    // variant of Dijkstra algorithm
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        Integer[][] globalEffort = new Integer[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // <minCost, x, y>
        pq.offer(new int[]{0, 0, 0});
        globalEffort[0][0] = 0;
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curMinEffortToCell = cur[0];
            int x = cur[1];
            int y = cur[2];
            
            if (x == m - 1 && y == n - 1)
                return curMinEffortToCell;
            
            for(int[] dir : dirs) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (newX < 0 || newX >= m || newY < 0 || newY >= n)
                    continue;
                
                int curHeight = heights[x][y];
                int newHeight = heights[newX][newY];
                int newEffort = Math.abs(curHeight - newHeight);
                
                int curEffortToNextCell = Math.max(curMinEffortToCell, newEffort);
                if (globalEffort[newX][newY] == null || curEffortToNextCell < globalEffort[newX][newY]) {
                    globalEffort[newX][newY] = curEffortToNextCell;
                    pq.offer(new int[]{globalEffort[newX][newY], newX, newY});
                }
            }
        }
        return -1;
    } 
}
