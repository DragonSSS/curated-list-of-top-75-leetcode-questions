package leetcode.design;

import java.util.LinkedList;
import java.util.Queue;

// much smarter one solution: https://leetcode.com/problems/design-hit-counter/discuss/83483/Super-easy-design-O(1)-hit()-O(s)-getHits()-no-fancy-data-structure-is-needed!
public class HitCounter {
    Queue<Integer> queue;
    public HitCounter() {
        queue = new LinkedList<>();
    }
    
    public void hit(int timestamp) {
        queue.offer(timestamp);
        while(queue.size() > 301){
            queue.poll();
        }
    }
    
    public int getHits(int timestamp) {
        while(!queue.isEmpty() && (timestamp - queue.peek() >= 300 || queue.size() > 301) ) {
            queue.poll();
        }
        return queue.size();
    }
}
