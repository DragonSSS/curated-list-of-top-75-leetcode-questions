package leetcode.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TimeNeededToInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < manager.length; i++) {
            graph.putIfAbsent(manager[i], new ArrayList<>());
            graph.get(manager[i]).add(i);
        }

        int res = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{headID, 0});

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int id = cur[0];
            int time = cur[1];
            res = Math.max(res, time);

            if(graph.containsKey(id)) {
                for(int next : graph.get(id)) {
                    queue.offer(new int[]{next, time + informTime[id]});
                }
            }
        }
        return res;
    }    
}
