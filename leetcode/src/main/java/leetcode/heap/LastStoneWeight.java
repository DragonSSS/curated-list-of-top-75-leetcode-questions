package leetcode.heap;

import java.util.PriorityQueue;

public class LastStoneWeight {
    // maxHeap
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0)
            return 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        for(int stone : stones) {
            pq.offer(stone);
        }
        
        while(pq.size() > 1) {
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            
            if (stone1 == stone2)
                continue;
            
            int newStone = Math.abs(stone1 - stone2);
            pq.offer(newStone);
        }
        
        return pq.size() == 0? 0 : pq.peek();
    }    
}
