package leetcode.graph;

public class MinimumDegreeOfConnectedTrioInGraph {
    public int minTrioDegree(int n, int[][] edges) {
        int[] degree = new int[n + 1];
        boolean[][] isEdge = new boolean[n + 1][n + 1];
        
        
        for(int[] edge : edges) {
            int start = edge[0];
            int end = edge[1];
            degree[start]++;
            degree[end]++;
            isEdge[start][end] = true;
            isEdge[end][start] = true;
        }
        
        int res = Integer.MAX_VALUE;
        boolean found = false;
        for(int[] edge : edges) {
            int start = edge[0];
            int end = edge[1];
            for (int i = 1; i <= n; i++) {
                if(isEdge[start][i] && isEdge[end][i]) {
                    found = true;
                    res = Math.min(res, degree[start] + degree[end] + degree[i] - 6);
                }
            }
        }
        
        if (!found) return -1;
        
        return res;
    }    
}
