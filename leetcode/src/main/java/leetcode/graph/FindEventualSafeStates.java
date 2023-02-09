package leetcode.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class FindEventualSafeStates {
    // topological sort
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] outdegree = new int[n];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int adjacent : graph[i]) {
                map.putIfAbsent(adjacent, new HashSet<>());
                map.get(adjacent).add(i);
                outdegree[i]++;
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(outdegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                res.add(cur);
                if (!map.containsKey(cur))
                    continue;
                for(int from : map.get(cur)) {
                    outdegree[from]--;
                    if(outdegree[from] == 0) {
                        queue.offer(from);
                    }
                }
            }
        }
        
        Collections.sort(res);
        return res;
    }
    
    int[] memo;
    public List<Integer> eventualSafeNodes_dfs(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        int n = graph.length;
        // 0 -> not visited yet
        // -1 -> visiting
        // 1 -> safe node
        memo = new int[n];
        for (int i = 0; i < n; i++) {
            if (helper(i, graph) == 1) {
                res.add(i);
            }
        }
        
        return res;
    }
    
    private int helper(int index, int[][] graph) {
        if (memo[index] != 0)
            return memo[index];
        
        // visiting
        memo[index] = -1;
        for(int next : graph[index]) {
            if (helper(next, graph) == -1) {
                return -1;
            }
        }
        
        // safe node
        memo[index] = 1;
        return memo[index];
    }
}
