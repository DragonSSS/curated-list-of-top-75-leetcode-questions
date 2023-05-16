package leetcode.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                count++;
                helper_dfs(isConnected, visited, i);
                // helper_bfs(isConnected, visited, i);
            }
        }
        return count;
    }

    private void helper_dfs(int[][] isConnected, boolean[] visited, int city) {
        for (int i = 0; i < isConnected[city].length; i++) {
            if (!visited[i] && isConnected[city][i] == 1) {
                visited[i] = true;
                helper_dfs(isConnected, visited, i);
            }
        }
    }

    private void helper_bfs(int[][] isConnected, boolean[] visited, int city) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(city);
        visited[city] = true;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0 ; i < size; i++) {
                int cur = queue.poll();
                for (int j = 0; j < isConnected[city].length; j++) {
                    if (visited[j] || isConnected[city][j] != 1)
                        continue;
                    visited[j] = true;
                    helper_bfs(isConnected, visited, j);
                }
            }
        }
    }

        // dfs or union-find
    boolean[] visited;
    public int findCircleNum_2r(int[][] isConnected) {
        int n = isConnected.length;
        visited = new boolean[n];
        int res = 0;
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                helper_2r(isConnected, i);
                res++;
            }
        }
        return res;
    }
    
    private void helper_2r(int[][] isConnected, int city) {
        for(int i = 0; i < isConnected[city].length; i++) {
            if(!visited[i] && isConnected[city][i] == 1) {
                visited[i] = true;
                helper_2r(isConnected, i);
            }
        }
    }
}
