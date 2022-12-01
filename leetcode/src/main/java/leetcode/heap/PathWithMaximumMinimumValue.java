package leetcode.heap;

import java.util.PriorityQueue;

public class PathWithMaximumMinimumValue {
    // pq + bfs + greedy to go with maximum cell with tracking minimum value in the path. :-)
    // variant of Dijkstra algorithm
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int maximumMinimumPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        // int[]{curMin, x, y};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int curMin = grid[0][0];
        visited[0][0] = true;
        pq.offer(new int[]{curMin, 0, 0});
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curVal = cur[0];
            int x = cur[1];
            int y = cur[2];
            if (x == m - 1 && y == n - 1)
                return curVal;
            for(int[] dir : dirs) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if(newX < 0 || newX >= m || newY < 0 || newY >= n || visited[newX][newY])
                    continue;
                visited[newX][newY] = true;
                pq.offer(new int[]{Math.min(grid[newX][newY], curVal), newX, newY});
            }
        }
        return -1;
    }    
}
