package leetcode.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class ReorderRoutesToMakeAllPathsLeadToCityZero {
    // n cities
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for(int[] connection : connections) {
            int start = connection[0];
            int end = connection[1];
            graph.putIfAbsent(start, new ArrayList<>());
            // if reverse current route, cost 1
            graph.get(start).add(new int[]{end, 1});
            graph.putIfAbsent(end, new ArrayList<>());
            // if reverse reversed current route, cost 0
            graph.get(end).add(new int[]{start, 0});
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(0);
        visited.add(0);
        int res = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                for(int[] next : graph.get(cur)) {
                    if (visited.contains(next[0]))
                        continue;
                    res += next[1];
                    queue.offer(next[0]);
                    visited.add(next[0]);
                }
            }
        }
        return res;
    }    
}
