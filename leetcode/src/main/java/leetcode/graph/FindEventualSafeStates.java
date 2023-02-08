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
}
