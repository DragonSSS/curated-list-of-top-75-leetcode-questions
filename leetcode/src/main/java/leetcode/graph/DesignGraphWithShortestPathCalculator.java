package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class DesignGraphWithShortestPathCalculator {
    Map<Integer, List<int[]>> graphWithCost;
    public DesignGraphWithShortestPathCalculator(int n, int[][] edges) {
        graphWithCost = new HashMap<>();
        for (int i = 0; i < n;  i++) {
            graphWithCost.put(i, new ArrayList<>());
        }
        for(int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];
            graphWithCost.get(from).add(new int[]{to, cost});
        }
    }
    
    public void addEdge(int[] edge) {
        int from = edge[0];
        int to = edge[1];
        int cost = edge[2];
         graphWithCost.get(from).add(new int[]{to, cost});
    }
    
    public int shortestPath(int node1, int node2) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, node1});
        Set<Integer> visited = new HashSet<>();
        while(pq.size() > 0) {
            int[] cur = pq.poll();
            int curCost = cur[0];
            int curNode = cur[1];
            if (curNode == node2) {
                return curCost;
            }
            visited.add(curNode);
            for(int[] next : graphWithCost.get(curNode)) {
                int nextNode = next[0];
                int nextCost = next[1];
                if (!visited.contains(nextNode)) {
                    pq.offer(new int[]{curCost + nextCost, nextNode});
                }
            }
        }
        return -1;
    }    
}
