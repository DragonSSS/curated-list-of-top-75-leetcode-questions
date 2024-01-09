package leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FindWinnerOfCircularGame {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while(queue.size() > 1) {
            int index = (k - 1) % queue.size();
            while(index > 0) {
                queue.offer(queue.poll());
                index--;
            }
            queue.poll();
        }
        return queue.poll();
    }    
}
