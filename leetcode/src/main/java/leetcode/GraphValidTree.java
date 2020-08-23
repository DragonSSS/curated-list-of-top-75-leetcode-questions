package leetcode;

import java.util.ArrayList;

public class GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        // [[0, 1], [0, 2], [0, 3], [1, 4]]
        // n = 5
        // detect if there is a circle and all node are present

        // visit
        // 0 = not visit,  1 = visiting,  2 = visited
        int[] visit = new int[n];

        // build graph
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges.length; i++){
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }


        // loop all vertex
        for (int i = 0; i < n; i++) {
            if(helper(-1, i, graph, visit))
                return false;
        }

        for (int v : visit) {
            if (v != 2)
                return false;
        }

        return true;
    }


    private boolean helper(int pre, int cur, ArrayList<Integer>[] graph, int[] visit) {

        // visiting  cycle
        if (visit[cur] == 1)
            return true;

        // visited
        if (visit[cur] == 2)
            return false;

        // start visiting
        visit[cur] =  1;

        for (int next : graph[cur]) {
            if (pre == next)
                continue;
            if(helper(cur, next, graph, visit))
                return true;
        }

        // set visited
        visit[cur] = 2;
        return false;
    }
}
