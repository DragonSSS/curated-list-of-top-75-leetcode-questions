package leetcode.heap;

import java.util.PriorityQueue;

public class ProcessTasksUsingServers {
    // int[][] freeServers 0-index 1-weight 2-available time
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = tasks.length;
        PriorityQueue<int[]> freeServers = new PriorityQueue<>(
            (a, b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]
        );

        PriorityQueue<int[]> usedServers = new PriorityQueue<>(
            (a, b) -> a[2] != b[2]? a[2] - b[2] : (a[1] != b[1]? a[1] - b[1] : a[0] - b[0])
        );
        for(int i = 0; i < servers.length; i++) {
            freeServers.offer(new int[]{i, servers[i], 0});
        }

        int[] res = new int[n];
        // when i timestamp, process ith tasks with time tasks[i]
        for(int i = 0; i < n; i++) {
            int processingTime = tasks[i];
            while(!usedServers.isEmpty() && usedServers.peek()[2] <= i) {
                freeServers.offer(usedServers.poll());
            }

            if (!freeServers.isEmpty()) {
                int[] server = freeServers.poll();
                res[i] = server[0];
                server[2] = i + processingTime;
                usedServers.offer(server);
            } else {
                int[] server = usedServers.poll();
                res[i] = server[0];
                server[2] += processingTime;
                usedServers.offer(server);
            }
        }

        return res;
    }    
}
