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

    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int minimumEffortPath_2r(int[][] heights) {
        // minHeap + int[][] globalMinEffor with update min value here;
        //int {min_cost, i, j}
        int m = heights.length, n = heights[0].length;
        Integer[][] globalMinEffort = new Integer[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0, 0});
        globalMinEffort[0][0] = 0;

        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int curMinCost = cur[0];
            int x = cur[1];
            int y = cur[2];

            if (x == m - 1 && y == n - 1) {
                return curMinCost;
            }

            for(int[] dir : dirs) {
                int nextX = x + dir[0];
                int nextY = y + dir[1];
                if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n) {
                    continue;
                }

                int nextCost = Math.abs(heights[nextX][nextY] - heights[x][y]);
                // A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
                int maxDiff = Math.max(curMinCost, nextCost);
                if (globalMinEffort[nextX][nextY] == null || maxDiff < globalMinEffort[nextX][nextY]) {
                    globalMinEffort[nextX][nextY] = maxDiff;
                    pq.offer(new int[]{maxDiff, nextX, nextY});
                }
            }
        }
        return -1;
    }
}
