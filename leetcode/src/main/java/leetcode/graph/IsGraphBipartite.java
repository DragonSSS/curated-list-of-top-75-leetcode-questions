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

    // union-find
    // find func check if current node and adjacent nodes have same parent
    // return false if the parent is the same one
    // try to union the all adjacent node as one group
    // could use path compression with ranking
    int[] parents;
    int[] rank;
    public boolean isBipartite_2r(int[][] graph) {
        int n = graph.length;
        parents = new int[n];
        rank = new int[n];
        
        for(int i = 0; i < n; i++) {
            parents[i] = i;
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < graph[i].length; j++) {
                int adjacent = graph[i][j];
                if(find(i) == find(adjacent)) {
                    return false;
                }
                // union all adajcent ones
                union(graph[i][0], adjacent);
            }
        }
        return true;
    }
    
    // ranking
    private void union(int i, int j) {
        int p1 = find(i);
        int p2 = find(j);
        
        if (p1 == p2)
            return;
        
        if(rank[p1] > rank[p2]) {
            parents[p2] = p1;
        } else if (rank[p1] < rank[p2]) {
            rank[p1] = p2;
        } else {
            parents[p2] = p1;
            rank[p1]++;
        }
    }
    
    // path compression
    private int find(int i) {
        while(parents[i] != i) {
            parents[i] = parents[parents[i]];
            i = parents[i];
        }
        return parents[i];
    }
}
