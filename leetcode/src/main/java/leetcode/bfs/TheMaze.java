package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class TheMaze {
     // bfs
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int m = maze.length, n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(start);
        visited[start[0]][start[1]] = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                if (cur[0] == destination[0] && cur[1] == destination[1])
                    return true;
                
                for(int[] dir : dirs) {
                    int x = cur[0];
                    int y = cur[1];
                    
                    while(x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == 0) {
                        x += dir[0];
                        y += dir[1];
                    }
                    
                    x -= dir[0];
                    y -= dir[1];
                    
                    if (visited[x][y])
                        continue;
                    
                    queue.offer(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
        return false;
    }

    // dfs
    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public boolean hasPath_dfs(int[][] maze, int[] start, int[] destination) {
        return helper(maze, start[0], start[1], destination, new boolean[maze.length][maze[0].length]);
    }
    
    private boolean helper(int[][] maze, int i, int j, int[] destination, boolean[][] visited) {
        if(i == destination[0] && j == destination[1])
            return true;
        
        if(visited[i][j])
            return false;
        
        visited[i][j] = true;
        for(int[] dir : dirs) {
            int x = i, y = j;
            while(x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 0) {
                x += dir[0];
                y += dir[1];
            }
            
            x -= dir[0];
            y -= dir[1];
            
            if(helper(maze, x, y, destination, visited))
                return true;
        }
        return false;
    }
}
