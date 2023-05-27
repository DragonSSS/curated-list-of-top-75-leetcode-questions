package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class MinCostToConnectAllPoints {
    // minimum spinning tree (MST)
    // Prim's algorithm
    // build graph without cycle with minimum cost weight
    // time complexity is O(n^2logn)
    public int minCostConnectPoints(int[][] points) {
        // number of points
        int num = points.length;
        Set<Integer> visited = new HashSet<>();
        // int[] = [cost, point]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        Map<Integer, List<int[]>> adjacentMap = new HashMap<>();
        int cost = 0;
        
        // build adjacent map with undirected graph by calculating weight
        for(int i = 0; i < num; i++) {
            adjacentMap.put(i, new ArrayList<>());
        }
        
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                int weight = Math.abs(points[i][0] - points[j][0])
                    + Math.abs(points[i][1] - points[j][1]);
                adjacentMap.get(i).add(new int[]{weight, j});
                adjacentMap.get(j).add(new int[]{weight, i});
            }
        }
        
        // start with 0 node with 0 weight
        pq.offer(new int[]{0, 0});
        
        // use pq to minimum the cost
        while(visited.size() < num) {
            int[] cur = pq.poll();
            int curCost = cur[0];
            int curNode = cur[1];
            
            if (visited.contains(curNode))
                continue;
            cost += curCost;
            // after count cost which means we visited it
            visited.add(curNode);
            for (int[] next : adjacentMap.get(curNode)) {  
                int nextCost = next[0];
                int nextNode = next[1];
                
                if (visited.contains(nextNode))
                    continue;
                pq.offer(new int[]{nextCost, nextNode});
            }
        }
        return cost;
    }

    // Kruskal's algorithm
    // union-find with min heap
    int[] parents;
    int[] rank;
    public int minCostConnectPoints_2r(int[][] points) {
        int n = points.length;
        parents = new int[n];
        rank = new int[n];
        int islands = n;
        int[][] dict = new int[n][n]; // store the weight between i and j
        int res = 0;
        
        for(int i = 0; i < n; i++) {
            parents[i] = i;
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> dict[a[0]][a[1]] - dict[b[0]][b[1]]);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dict[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                pq.offer(new int[] {i, j});
            }
        }
        
        while(!pq.isEmpty() && islands > 1) {
            int[] curEdge = pq.poll();
            if (union(curEdge[0], curEdge[1])) {
                res += dict[curEdge[0]][curEdge[1]];
                islands--;
            }
        }
        
        return res;
    }
    
    private boolean union(int i, int j) {
        int p1 = find(i);
        int p2 = find(j);
        
        if (p1 == p2)
            return false;
        
        if (rank[p1] > rank[p2]) {
            parents[p2] = p1;
        } else if (rank[p1] < rank[p2]) {
            parents[p1] = p2;
        } else {
            parents[p1] = p2;
            rank[p2]++;
        }
        
        return true;
    }
    
    private int find(int i) {
        while(parents[i] != i) {
            parents[i] = parents[parents[i]];
            i = parents[i];
        }
        return parents[i];
    }

    // int[] parents;
    int[] ranking;
    public int minCostConnectPoints_3r(int[][] points) {
        int n = points.length;
        parents = new int[n];
        ranking = new int[n];
        int[][] dist = new int[n][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> dist[a[0]][a[1]] - dist[b[0]][b[1]]);

        for(int i = 0; i < n; i++) {
           parents[i] = i; 
        }

        for(int i = 0; i < n; i++) {
            int[] point1 = points[i];
            for(int j = 0; j < n; j++) {
                int[] point2 = points[j];
                dist[i][j] = Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
                pq.offer(new int[]{i, j});
            }
        }
        int count = n;
        int res = 0;
        while(!pq.isEmpty() && count > 1) {
            int[] cur = pq.poll();
            if(union_3r(cur[0], cur[1])) {
                count--;
                res += dist[cur[0]][cur[1]];
            }
        }
        return res;
    }


    private boolean union_3r(int id1, int id2) {
        int p1 = find_3r(id1);
        int p2 = find_3r(id2);

        if (p1 == p2) {
            return false;
        }

        if(ranking[p1] > ranking[p2]) {
            parents[p2] = p1;
        } else if(ranking[p2] > ranking[p1]) {
            parents[p1] = p2;
        } else {
            parents[p2] = p1;
            ranking[p1]++;
        }

        return true;
    }

    private int find_3r(int id) {
        while(parents[id] != id) {
            id = parents[id];
        }
        return parents[id];
    }
}
