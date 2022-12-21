package leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class DetonateMaximumBombs {
    public int maximumDetonation(int[][] bombs) {
        int max = 0;
        for(int i = 0; i < bombs.length; i++) {
            int cur = helper(i, bombs, new boolean[bombs.length]);
            max = Math.max(cur, max);
        }
        return max;
    }
    
    private int helper(int index, int[][] bombs, boolean[] visited) {
        int curCount = 1;
        visited[index] = true;
        for(int i = 0; i < bombs.length; i++) {
            if (visited[i])
                continue;
            if (isInRange(bombs[index], bombs[i]))
                curCount += helper(i, bombs, visited);
        }
        return curCount;
    }
    
    private boolean isInRange(int[] b1, int[] b2) {
        long dx = b1[0] - b2[0];
        long dy = b1[1] - b2[1];
        long distance = dx * dx + dy * dy;
        long r = b1[2];
        return distance <= r * r;
    }

    // bfs version
    private int helper_bfs(int index, int[][] bombs, boolean[] visited) {
        int curCount = 1;
        visited[index] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(index);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                for(int j = 0; j < bombs.length; j++) {
                    if (visited[j])
                        continue;
                    if (isInRange(bombs[cur], bombs[j])) {
                        queue.offer(j);
                        curCount++;
                        visited[j] = true;
                    }
                }
            }
        }
        return curCount;
    }
}
