package leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

public class MaximumScoreOfGoodSubarray {
    // use two monotonic stacks to find the previous & next smaller element
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int[] preSmaller = new int[n];
        int[] nextSmaller = new int[n];
        Arrays.fill(preSmaller, -1);
        Arrays.fill(nextSmaller, n);
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                nextSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        stack.clear();

        for(int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                preSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        int res = 0;
        for(int i = 0; i < n; i++) {
            if((preSmaller[i] + 1 <= k) && (nextSmaller[i] - 1 >= k)) {
               res = Math.max(res, nums[i] * (nextSmaller[i] - preSmaller[i] - 1));
            }
        }
        return res;
    }    
}
