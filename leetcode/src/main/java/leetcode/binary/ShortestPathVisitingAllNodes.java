package leetcode.binary;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathVisitingAllNodes {
    // bitmask + bfs
    // dp[i][mask] = distance to mask 10110
    // 0 not visited, 1 visited in mask
    // 4 nodes
    // 1 << 4
    // 00001
    // 10000
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int fullMask = (1 << n) - 1;
        int dp[][] = new int[n][fullMask + 1];

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][1 << i] = 0;
            queue.offer(new int[]{i, 1 << i});
        }

        int res = Integer.MAX_VALUE;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int node = cur[0];
                int curMask = cur[1];

                for(int next : graph[node]) {
                    int nextMask = curMask | (1 << next);
                    if(dp[next][nextMask] > dp[node][curMask] + 1) {
                        dp[next][nextMask] = dp[node][curMask] + 1;
                        queue.offer(new int[]{next, nextMask});
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            res = Math.min(res, dp[i][fullMask]);
        }

        return res == Integer.MAX_VALUE? -1 : res;
    }    
}
