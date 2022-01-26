package leetcode.array;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubarrayWithSumAtLeastK {
    public int shortestSubarray(int[] nums, int k) {
        long[] prefixSum = new long[nums.length + 1];
        int res = nums.length + 1;
        for(int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        
        Deque<Integer> startIndexes = new ArrayDeque<>();
        for (int i = 0; i < nums.length + 1; i++) {
            while(!startIndexes.isEmpty() && prefixSum[i] - prefixSum[startIndexes.peek()] >= k) {
                res = Math.min(res, i - startIndexes.poll());
            }
            
            while(!startIndexes.isEmpty() && prefixSum[i] <= prefixSum[startIndexes.peekLast()]) {
                startIndexes.pollLast();
            }
            startIndexes.offer(i); 
        }
        
        return res <= nums.length? res : -1;
    }    
}
