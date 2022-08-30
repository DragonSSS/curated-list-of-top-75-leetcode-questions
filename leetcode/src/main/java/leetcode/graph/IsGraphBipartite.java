package leetcode.graph;

public class IsGraphBipartite {
    // graph.length = number of nodes
    // dfs recursively to colorize graph with two color
    // helper return false if adjacent one has same color
    int[] colors;
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        colors = new int[n];
        for(int i = 0; i < n; i++) {
            if(colors[i] == 0 && !helper(i, 1, graph)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean helper(int cur, int color, int[][] graph) {
        if (colors[cur] != 0)
            return colors[cur] == color;
        
        colors[cur] = color;
        for(int next : graph[cur]) {
            if(!helper(next, -color, graph))
                return false;
        }
        return true;
    }    
}
