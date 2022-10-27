package leetcode.design;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StockPrice {
    int latestTimestamp;
    Map<Integer, Integer> timestampToPrice;
    PriorityQueue<int[]> minHeap;
    PriorityQueue<int[]> maxHeap;
    
    public StockPrice() {
        latestTimestamp = 0;
        timestampToPrice = new HashMap<>();
        minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
    }
    
    public void update(int timestamp, int price) {
        latestTimestamp = Math.max(timestamp, latestTimestamp);
        timestampToPrice.put(timestamp, price);
        
        minHeap.offer(new int[]{price, timestamp});
        maxHeap.offer(new int[]{price, timestamp});
    }
    
    public int current() {
        return timestampToPrice.get(latestTimestamp);
    }
    
    public int maximum() {
        int[] cur = maxHeap.peek();
        int curPrice = cur[0];
        int curTimestamp = cur[1];
        while(timestampToPrice.get(curTimestamp) != curPrice) {
            maxHeap.poll();
            curPrice = maxHeap.peek()[0];
            curTimestamp = maxHeap.peek()[1];
        }
        return curPrice;
    }
    
    public int minimum() {
        int[] cur = minHeap.peek();
        int curPrice = cur[0];
        int curTimestamp = cur[1];
        while(timestampToPrice.get(curTimestamp) != curPrice) {
            minHeap.poll();
            curPrice = minHeap.peek()[0];
            curTimestamp = minHeap.peek()[1];
        }
        return curPrice;  
    }    
}
