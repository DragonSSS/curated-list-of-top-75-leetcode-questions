package leetcode.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();
        int right = 0;
        int left = 0;
        int res = 0;
        while(right < nums.length) {
            while(!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right]) {
                minDeque.pollLast();
            }
            minDeque.addLast(right);
            while(!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(right);
            int min = nums[minDeque.peekFirst()];
            int max = nums[maxDeque.peekFirst()];
            if (max - min <= limit) {
                res = Math.max(res, right - left + 1);
                right++;
            } else {
                left++;
                while(!minDeque.isEmpty() && minDeque.peekFirst() < left) {
                    minDeque.pollFirst();
                }
                while(!maxDeque.isEmpty() && maxDeque.peekFirst() < left) {
                    maxDeque.pollFirst();
                }
            }
        }

        return res;
    }
}
