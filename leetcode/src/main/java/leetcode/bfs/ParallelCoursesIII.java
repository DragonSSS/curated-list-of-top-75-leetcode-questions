package leetcode.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class ParallelCoursesIII {
    // topological sort
    // record the max elapsed time for each course
    public int minimumTime(int n, int[][] relations, int[] time) {
        int[] elapsedTime = new int[n];
        int res = 0;
        
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        int[] indegree = new int[n];

        for(int[] relation : relations) {
            int from = relation[0] - 1;
            int to = relation[1] - 1;
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(to);
            indegree[to]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < n; i++) {
            if(indegree[i] == 0) {
                elapsedTime[i] = time[i];
                queue.offer(i);
                visited.add(i);
            }
        }

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0 ; i < size; i++) {
                int cur = queue.poll();
                res = Math.max(res, elapsedTime[cur]);
                
                if (!graph.containsKey(cur)) {
                    continue;
                }

                for(int next : graph.get(cur)) {
                    elapsedTime[next] = Math.max(elapsedTime[next], elapsedTime[cur] + time[next]);
                    indegree[next]--;
                    if (indegree[next] == 0 && !visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
        }

        return res;
    }    
}
