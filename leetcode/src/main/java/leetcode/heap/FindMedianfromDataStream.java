package leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianfromDataStream {
    /** initialize your data structure here. */
    Queue<Integer> smallHalf;
    Queue<Integer> largeHalf;
    public FindMedianfromDataStream() {
        smallHalf = new PriorityQueue<>((a, b) -> b - a); // 4321
        largeHalf = new PriorityQueue<>((a, b) -> a - b); // 567
    }

    public void addNum(int num) {
        if (smallHalf.size() != largeHalf.size()) {
            smallHalf.offer(num);
            largeHalf.offer(smallHalf.poll());
        } else {
            largeHalf.offer(num);
            smallHalf.offer(largeHalf.poll());
        }
    }

    public double findMedian() {
        if (smallHalf.size() != largeHalf.size()) {
            return smallHalf.peek();
        } else {
            return (smallHalf.peek() + largeHalf.peek()) / 2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
