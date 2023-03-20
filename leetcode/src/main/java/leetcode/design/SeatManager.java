package leetcode.design;

import java.util.PriorityQueue;

public class SeatManager {
    PriorityQueue<Integer> pq;
    int curSeat;

    public SeatManager(int n) {
        pq = new PriorityQueue<>();
        curSeat = 1;
    }
    
    public int reserve() {
        if (pq.isEmpty()) {
            return curSeat++;
        } else {
            return pq.poll();
        }
    }
    
    public void unreserve(int seatNumber) {
        pq.offer(seatNumber);
    }    
}
