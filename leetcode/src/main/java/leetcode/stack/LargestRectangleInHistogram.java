package leetcode.stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    // monotonic stack
    int maxArea = 0;
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>(); // [0] - starting index by looking backward, [1] - height
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while(!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] cur = stack.pop();
                maxArea = Math.max(maxArea, cur[1] * (i - cur[0]));
                start = cur[0];
            }
            stack.push(new int[]{start, heights[i]});
        }
        //       -
        //     - -
        //   - - -
        // - - - -
        // 0 1 2 3             heights.length = 4
        // process rest stack with increasing order
        while(!stack.isEmpty()) {
            int[] cur = stack.pop();
            maxArea = Math.max(maxArea, cur[1] * (heights.length - cur[0])); // look forward
        }
        return maxArea;
    }
}
