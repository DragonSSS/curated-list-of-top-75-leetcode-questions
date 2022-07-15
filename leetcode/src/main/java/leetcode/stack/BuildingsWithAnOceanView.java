package leetcode.stack;

import java.util.Stack;

public class BuildingsWithAnOceanView {
    public int[] findBuildings(int[] heights) {
        // monotonic stack
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] <= heights[i]) {
                stack.pop();
            }
            stack.push(i);
        }
        
        int[] res = new int[stack.size()];
        for(int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        
        return res;
    }    
}
