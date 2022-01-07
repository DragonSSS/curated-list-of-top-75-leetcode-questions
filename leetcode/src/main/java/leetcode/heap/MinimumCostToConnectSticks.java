package leetcode.heap;

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {
    // priorityQueue + greedy
    // the earlier stick combined will be added into cost again, so we want to smaller stick combined first asap and cost will be minimum
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int stick : sticks) {
            pq.offer(stick);
        }
        
        int cost = 0;
        while(pq.size() > 1) {
            int curCost = pq.poll() + pq.poll();
            cost += curCost;
            pq.offer(curCost);
        }
        
        return cost;
    }
}
