package leetcode.graph;

public class MaximalNetworkRank {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] indegree = new int[n];
        boolean[][] connected = new boolean[n][n];
        for(int[] road : roads) {
            indegree[road[0]]++;
            indegree[road[1]]++;
            connected[road[0]][road[1]] = true;
            connected[road[1]][road[0]] = true;
        }
        int res = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                res = Math.max(res, indegree[i] + indegree[j] - (connected[i][j] ? 1 : 0));
            }
        }
        return res;
    }    
}
