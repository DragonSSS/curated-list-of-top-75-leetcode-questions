package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountZeroRequestServers {
    // log = serverId, time
    // query = query - x, query
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        // sort log based on time
        // logLeft, logRight as pointers of sliding window
        // sort queries by time with qurey id
        int[][] queriesWithId = new int[queries.length][2];
        for(int i = 0; i < queries.length; i++) {
            queriesWithId[i] = new int[]{i, queries[i]};
        }
        Arrays.sort(queriesWithId, (a, b) -> a[1] - b[1]);
        Arrays.sort(logs, (a, b) -> a[1] - b[1]);

        Map<Integer, Integer> activesServers = new HashMap<>();
        int left = 0, right = 0;
        int[] res = new int[queries.length];
        for(int[] query : queriesWithId) {
            int queryId = query[0];
            int queryStart = query[1] - x;
            int queryEnd = query[1];

            while(right < logs.length && logs[right][1] <= queryEnd) {
                int serverId = logs[right][0];
                activesServers.put(serverId, activesServers.getOrDefault(serverId, 0) + 1);
                right++;
            }

            while(left < logs.length && logs[left][1] < queryStart) {
                int serverId = logs[left][0];
                activesServers.put(serverId, activesServers.get(serverId) - 1);
                if (activesServers.get(serverId) == 0) {
                    activesServers.remove(serverId);
                }
                left++;
            }
            res[queryId] = n - activesServers.size();
        }
        return res;
    }    
}
