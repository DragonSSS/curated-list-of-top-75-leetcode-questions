package leetcode.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumNumberOfEventsThatCanBeAttended {
    // priorityQueue + Greedy
    public int maxEvents(int[][] events) {
        // sort event by starting time
        // iterate day 1 to 10^5
        // use priorityQueue to track closing time
        // poll() already closed event
        // offer() event can be attended at ith day
        // poll() event attended, make res += 1
        Arrays.sort(events, (a,b) -> (a[0] - b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0, res = 0;
        for (int i = 1; i <= 100000; i++) {
            while(!pq.isEmpty() && pq.peek() < i) {
                pq.poll();
            }
            while(index < events.length && events[index][0] == i) {
                pq.offer(events[index++][1]);
            }
            
            if (!pq.isEmpty()) {
                pq.poll();
                res++;
            }
        }
        return res;
    }
}
