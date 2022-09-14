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
}
