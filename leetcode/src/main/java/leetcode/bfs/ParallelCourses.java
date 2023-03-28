package leetcode.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class ParallelCourses {
    // topological sort + bfs
    // 1 to n
    public int minimumSemesters(int n, int[][] relations) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[n + 1];

        // build graph
        for(int[] relation : relations) {
            int from = relation[0];
            int to = relation[1];
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(to);
            indegree[to]++;
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            if(indegree[i] == 0) {
                queue.offer(i);
                visited.add(i);
            }
        }

        int res = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();

                if (!graph.containsKey(cur)){
                    continue;
                }

                for (int next : graph.get(cur)) {
                    indegree[next]--;
                    if (indegree[next] == 0 && !visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
            res++;
        }

        return visited.size() == n? res : -1;
    }    
}
