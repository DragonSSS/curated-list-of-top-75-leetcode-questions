package leetcode.queue;

import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    // [1,3,-1,-3,5,3,6,7], k = 3
    // O(nlogn)
    public int[] maxSlidingWindow_pq_tle(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0 ; i < nums.length; i++) {
            if ( i >= k) {
                pq.remove(nums[i - k]);
            }
            pq.offer(nums[i]);
            if (i >= k - 1) {
                res[i - k + 1] = pq.peek();
            }
        }
        return res;
    }

    // deque to track valid index of nums that is at peek()
    // keep cleaning old index from peek() that is out of the window
    // keep cleaning useless index that has smaller value from peekLast()
    // O(n)
    public int[] maxSlidingWindow_deque(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0 ; i < nums.length; i++) {
            while(!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                res[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
