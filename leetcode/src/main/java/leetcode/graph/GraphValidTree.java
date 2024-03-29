package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphValidTree {
    // detect circle in graph
    // dfs check all nodes visited
    public boolean validTree(int n, int[][] edges) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }

        boolean[] visited = new boolean[n];

        for(int i = 0; i < edges.length; i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        if (!helper(-1, 0, graph, visited))
            return false;

        for(boolean v : visited) {
            if (!v)
                return false;
        }

        return true;
    }

    private boolean helper(int pre, int cur, Map<Integer, ArrayList<Integer>> graph, boolean[] visited) {
        if(visited[cur])
            return false;

        visited[cur] = true;

        for(int next : graph.get(cur)) {
            if(next != pre && !helper(cur, next, graph, visited))
                return false;
        }

        return true;
    }

    public boolean validTreeBFS(int n, int[][] edges) {

        Set<Integer> visit = new HashSet<>();
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            visit.add(cur);

            for (int next : graph.get(cur)) {
                if (queue.contains(next)) {
                    return false;
                }
                if (!visit.contains(next)) {
                    queue.offer(next);
                }

            }
        }

        return visit.size() == n;
    }

    Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] visited;
    public boolean validTree_2r_dfs(int n, int[][] edges) {
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        for(int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }
        
        if (helper_2r_dfs(-1, 0, visited)) {
            return false;
        }
        
        for(boolean v : visited) {
            if(!v) {
                return false;
            }
        }
        return true;
    }
    
    // detect a cycle in undirected graph, no backtracking
    private boolean helper_2r_dfs(int pre, int cur, boolean[] visited) {
        if(visited[cur])
            return true;
        
        visited[cur] = true;
        for(int next : graph.get(cur)) {
            if (next != pre && helper_2r_dfs(cur, next, visited)) {
                return true;
            }
        }
        
        return false;
    }

    Set<Integer> visited_bfs = new HashSet<>();
    public boolean validTree_2r_bfs(int n, int[][] edges) {
        for(int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        for(int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited_bfs.add(0);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                
                for(int next : graph.get(cur)) {
                    if (queue.contains(next)) {
                        return false;
                    }
                    
                    if(!visited_bfs.contains(next)) {
                        queue.offer(next);
                        visited_bfs.add(next);
                    }
                }
            }
        }
                
        return visited_bfs.size() == n;
    }

    Map<Integer, List<Integer>> graph_3r = new HashMap<>();
    Set<Integer> visited_3r = new HashSet<>();
    public boolean validTree_3r(int n, int[][] edges) {
        // build graph
        for(int i = 0; i < n; i++) {
            graph_3r.put(i, new ArrayList<>());
        }
        
        for(int[] edge : edges) {
            int start = edge[0];
            int end = edge[1];
            graph_3r.get(start).add(end);
            graph_3r.get(end).add(start);
        }
        
        if (helper_3r(-1, 0)) {
            return false;
        }
        
        if (visited_3r.size() < n)
            return false;
        
        return true;
    }
    
    private boolean helper_3r(int pre, int cur) {
        if (visited_3r.contains(cur))
            return true;
        
        visited_3r.add(cur);
        for(int next : graph.get(cur)) {
            if (next == pre)
                continue;
            if (helper_3r(cur, next))
                return true;
        }
        return false;
    }
}
