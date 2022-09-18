package leetcode.heap;

import java.util.PriorityQueue;

public class SwimInRisingWater {
    // O(n^2logn)
    // From top left to right bottom, there are many paths. For each path we have one maximum value. 
    // Let's find the minimal one of such maximum value.
    // So the minimal maximum value in each path.
    // similar to #1102 Path With Maximum Minimum Value
    int[][] dirs = {{0, 1}, {1, 0},{-1, 0}, {0, -1}};
    public int swimInWater(int[][] grid) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (grid[a[0]][a[1]] - grid[b[0]][b[1]]));
        pq.add(new int[]{0, 0});

        int level = 0;
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];

        while (!pq.isEmpty()){
            int[] cur = pq.poll();
            level = Math.max(level, grid[cur[0]][cur[1]]);
            if (cur[0] == n - 1 && cur[1] == n - 1)
                break;
            
            for (int[] dir : dirs){
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                if (x < 0 || x >= n || y < 0 || y >= n || visited[x][y])
                    continue;

                visited[cur[0]][cur[1]] = true;
                pq.add(new int[]{x, y});
            }
        }
        
        return level;
    }
    // Dijkstra's algorithm by minHeap
    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int swimInWater_2r(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        int res = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> grid[a[0]][a[1]] - grid[b[0]][b[1]]);
        pq.offer(new int[]{0, 0});
        
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            res = Math.max(res, grid[cur[0]][cur[1]]);
            
            if(cur[0] == n - 1 && cur[1] == n - 1)
                return res;
            
            for(int[] dir : dirs) {
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                
                if (x < 0 || x >= n || y < 0 || y >= n || visited[x][y])
                    continue;
                visited[x][y] = true;
                pq.offer(new int[]{x, y});
            }
        }
        return res;
    }
}
