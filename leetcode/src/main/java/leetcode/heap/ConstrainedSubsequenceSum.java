package leetcode.heap;

import java.util.PriorityQueue;

public class ConstrainedSubsequenceSum {
    public int constrainedSubsetSum(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int res = nums[0];

        pq.offer(new int[]{nums[0], 0});
        for(int i = 1; i < nums.length; i++) {
            while(i - pq.peek()[1] > k) {
                pq.poll();
            }

            int curSum = Math.max(0, pq.peek()[0]) + nums[i];
            res = Math.max(curSum, res);
            pq.offer(new int[]{curSum, i});
        }
        return res;
    }    
}
