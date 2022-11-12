package leetcode.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingScheduler {
    // <10, 20> <30, 40> <60, 80>
    
    // <5, 10> <20, 45> <45, 65>
    
    // duration = 10
    
    // trick to use minHeap
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int[] slot : slots1) {
            if ((slot[1] - slot[0]) >= duration) {
                pq.offer(slot);
            }
        }
        
        for (int[] slot : slots2) {
            if ((slot[1] - slot[0]) >= duration) {
                pq.offer(slot);
            }
        }
        
        while(pq.size() > 1) {
            if (pq.poll()[1] >= pq.peek()[0] + duration) {
                return Arrays.asList(pq.peek()[0], pq.peek()[0] + duration);
            }
        }
        return new ArrayList<>();
    }    
}
