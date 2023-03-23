package leetcode.design;

import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.pq = new PriorityQueue<>();

        for(int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }    
}
