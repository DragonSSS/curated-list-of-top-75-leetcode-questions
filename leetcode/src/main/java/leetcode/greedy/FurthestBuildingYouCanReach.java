package leetcode.greedy;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for(int i = 0; i < heights.length - 1; i++) {
            int dist = heights[i + 1] - heights[i];
            if (dist <= 0) {
                continue;
            }
            pq.offer(dist);
            if (pq.size() <= ladders) {
                continue;
            }

            bricks -= pq.poll();
            if (bricks < 0) {
                return i;
            }
        }
        return heights.length - 1;
    }    
}
