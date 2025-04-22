package leetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class NumberOfWaysToArriveAtDestination {
    // roads[i] = [ui, vi, timei]
    public int countPaths(int n, int[][] roads) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int  i = 0;  i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // build graph
        for (int[] road : roads) {
            int from = road[0];
            int to = road[1];
            int time = road[2];
            graph.get(from).add(new int[]{to, time});
            graph.get(to).add(new int[]{from, time});
        }

        long[] cost = new long[n];
        int[] ways = new int[n];
        Arrays.fill(cost, Long.MAX_VALUE);
        cost[0] = 0;
        ways[0] = 1;

        // int[]{mini_time, nodeId}
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        pq.offer(new long[]{0, 0});

        int MOD = 1_000_000_007;

        while(!pq.isEmpty()) {
            long[] cur = pq.poll();
            long curTime = cur[0];
            int curNode = (int) cur[1];

            if (curTime > cost[curNode]) {
                continue;
            }

            for(int[] next : graph.get(curNode)) {
                int nextNode = next[0];
                int nextCost = next[1];
                if (cost[curNode] + nextCost < cost[nextNode]) {
                    cost[nextNode] = cost[curNode] + nextCost;
                    ways[nextNode] = ways[curNode];
                    pq.offer(new long[]{cost[nextNode], nextNode});
                } else if (cost[curNode] + nextCost == cost[nextNode]) {
                    ways[nextNode] = (ways[nextNode] + ways[curNode]) % MOD;
                }
            }
        }
        return ways[n - 1];
    }    
}
