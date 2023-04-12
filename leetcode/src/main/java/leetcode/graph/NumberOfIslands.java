package leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    private int[][] dirs = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int numIslands(char[][] grid) {
        int res = 0;
        if (grid == null || grid.length == 0)
            return res;

        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1' && !visited[i][j]){
                    res++;
                    helper(i, j, visited, grid);
                    // helper_bfs(i, j, visited, grid);
                }
            }
        }

        return res;
    }

    // dfs_version
    private void helper(int i, int j, boolean[][] visited, char[][] grid) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1 || visited[i][j] || grid[i][j] == '0')
            return;

        visited[i][j] = true;

        for (int k = 0; k < dirs.length; k++) {
            helper(i + dirs[k][0], j + dirs[k][1], visited, grid);
        }
    }

    // bfs_version
    private void helper_bfs(int i, int j, boolean[][] visited, char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int k = 0; k < size; k++) {
                int[] cur = queue.poll();
                for (int[] dir : dirs) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != '1' || visited[x][y]) {
                        continue;
                    }

                    visited[x][y] = true;
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }

    public int numIslands_2r_dfs(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int res = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    helper_2r_dfs(grid, i, j, visited);
                }
            }
        }
        
        return res;
    }
    
    private void helper_2r_dfs(char[][] grid, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        
        for(int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            
            if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || visited[x][y] || grid[x][y] != '1')
                continue;
            
            helper_2r_dfs(grid, x, y, visited);
        }
    }

    public int numIslands_2r_bfs(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int res = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    helper_2r_bfs(grid, i, j, visited);
                }
            }
        }
        
        return res;
    }
    
    private void helper_2r_bfs(char[][] grid, int i, int j, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int k = 0; k < size; k++) {
                int[] cur = queue.poll();
                for(int[] dir : dirs) {
                    int[] next = new int[]{cur[0] + dir[0], cur[1] + dir[1]};
                    if(next[0] < 0 || next[0] >= grid.length || next[1] < 0 || next[1] >= grid[0].length || grid[next[0]][next[1]] == '0' || visited[next[0]][next[1]])
                        continue;
                    queue.offer(next);
                    visited[next[0]][next[1]] = true;
                }
            }
        }
    }

    boolean[][] visited;
    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int numIslands_3r(char[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        int res = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    helper_3r(i, j, grid);           
                }
            }
        }
        return res;
    }
    
    private void helper_3r(int i, int j, char[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || visited[i][j])
            return;
        
        visited[i][j] = true;  
        for(int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            helper_3r(x, y, grid);
        }
    }

    // boolean[][] visited;
    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int numIslands_4r(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        visited = new boolean[m][n];
        int res = 0;
        for(int i = 0; i < m ; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    helper_4r(grid, i, j);
                }
            }
        }
        return res;
    }

    private void helper_4r(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        for(int[] dir : dirs) {
            helper_4r(grid, i + dir[0], j + dir[1]);
        }
    }
}
