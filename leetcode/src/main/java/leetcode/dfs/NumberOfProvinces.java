package leetcode.dfs;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                count++;
                helper_dfs(isConnected, visited, i);
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
}
