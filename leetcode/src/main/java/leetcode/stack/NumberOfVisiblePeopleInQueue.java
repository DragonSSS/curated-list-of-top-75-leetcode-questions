package leetcode.stack;

import java.util.Stack;

public class NumberOfVisiblePeopleInQueue {
    // monotonic stack
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        
        for(int i = 0 ; i < n; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] <= heights[i]) {
                res[stack.pop()] += 1;
            }
            if (!stack.isEmpty()) {
                res[stack.peek()] += 1;
            }
            stack.push(i);
        }
        return res;
    }    
}
