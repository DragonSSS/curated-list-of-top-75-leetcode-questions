package leetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PacificAtlanticWaterFlow {
    private int[][] dirs = new int[][]{{0,1}, {1,0}, {-1,0}, {0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return res;

        int row = matrix.length;
        int col = matrix[0].length;

        boolean[][] pac = new boolean[row][col];
        boolean[][] alt = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            helper(i, 0, Integer.MIN_VALUE, matrix, pac);
            helper(i, col - 1, Integer.MIN_VALUE, matrix, alt);
        }

        for (int i = 0; i < col; i++) {
            helper(0, i, Integer.MIN_VALUE, matrix, pac);
            helper(row - 1, i, Integer.MIN_VALUE, matrix, alt);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (pac[i][j] && alt[i][j])
                    res.add(Arrays.asList(i, j));
            }
        }
        return res;

    }

    private void helper(int i, int j, int pre, int[][] matrix, boolean[][] visited) {
        if (i < 0 || j < 0 || i > matrix.length - 1 || j > matrix[0].length - 1 || visited[i][j] || matrix[i][j] < pre)
            return;

        visited[i][j] = true;

        for(int k = 0; k < dirs.length; k++){
            helper(i + dirs[k][0], j + dirs[k][1], matrix[i][j], matrix, visited);
        }
    }

    public List<List<Integer>> pacificAtlantic_2r_dfs(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        
        int m = heights.length;
        int n = heights[0].length;
        
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        
        for(int i = 0; i < n; i++) {
            helper_2r_dfs(0, i, Integer.MIN_VALUE, heights, pacific);
            helper_2r_dfs(m - 1, i, Integer.MIN_VALUE, heights, atlantic);
        }
        
        for(int i = 0; i < m; i++) {
            helper_2r_dfs(i, 0, Integer.MIN_VALUE, heights, pacific);
            helper_2r_dfs(i, n - 1, Integer.MIN_VALUE, heights, atlantic);
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }
    
    private void helper_2r_dfs(int i, int j, int pre, int[][] ocean, boolean[][] visited) {
        if (i < 0 || i >= ocean.length || j < 0 || j >= ocean[0].length || visited[i][j] || pre > ocean[i][j])
            return;
        
        visited[i][j] = true;
        
        for(int[] dir : dirs) {
            helper_2r_dfs(i + dir[0], j + dir[1], ocean[i][j], ocean, visited);
        }
        
        return;
    }

    // bfs
    public List<List<Integer>> pacificAtlantic_2r_bfs(int[][] heights) {
        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();
        
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        
        for(int i = 0; i < n; i++) {
            pacificQueue.offer(new int[]{0, i});
            pacific[0][i] = true;
            atlanticQueue.offer(new int[]{m - 1, i});
            atlantic[m - 1][i] = true;
        }
        
        for(int i = 0; i < m; i++) {
            pacificQueue.offer(new int[]{i, 0});
            pacific[i][0] = true;
            atlanticQueue.offer(new int[]{i, n - 1});
            atlantic[i][n - 1] = true;
        }
        
        helper_2r_bfs(pacificQueue, pacific, heights);
        helper_2r_bfs(atlanticQueue, atlantic, heights);
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        
        return res;
    }
    
    private void helper_2r_bfs(Queue<int[]> queue, boolean[][] visited, int[][] heights) {
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i< size; i++) {
                int[] cur = queue.poll();
                for(int[] dir : dirs) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    
                    if (x < 0 || x >= heights.length || y < 0 || y >= heights[0].length || visited[x][y] || heights[x][y] < heights[cur[0]][cur[1]])
                        continue;
                    
                    visited[x][y] = true;
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }

    // int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public List<List<Integer>> pacificAtlantic_3r(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];
        Queue<int[]> queuePacific = new LinkedList<>();
        Queue<int[]> queueAtlantic = new LinkedList<>();
        
        
        for(int i = 0; i < row; i++) {
            pacific[i][0] = true;
            queuePacific.offer(new int[]{i, 0});
            atlantic[i][col - 1] = true;
            queueAtlantic.offer(new int[]{i, col - 1});
        }
        
        for(int i = 0; i < col; i++) {
            pacific[0][i] = true;
            queuePacific.offer(new int[]{0, i});
            atlantic[row - 1][i] = true;
            queueAtlantic.offer(new int[]{row - 1, i});
        }
        
        helper_3r(heights, pacific, queuePacific);
        helper_3r(heights, atlantic, queueAtlantic);
        
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if (pacific[i][j] && atlantic[i][j])
                    res.add(Arrays.asList(i, j));
            }
        }
        
        return res;
    }
    
    private void helper_3r(int[][] heights, boolean[][] ocean, Queue<int[]> queue) {
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                
                for(int[] dir : dirs) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    
                    if (x < 0 || x >= heights.length || y < 0 || y >= heights[0].length || ocean[x][y] || heights[x][y] < heights[cur[0]][cur[1]])
                        continue;
                    
                    ocean[x][y] = true;
                    queue.offer(new int[] {x, y});
                }
            }
        }
    }
}
