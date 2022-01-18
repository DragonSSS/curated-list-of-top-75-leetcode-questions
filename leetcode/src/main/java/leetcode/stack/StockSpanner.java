package leetcode.stack;

import java.util.Stack;

public class StockSpanner {
    // monotonic stack
    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1; //inclusively
        while(!stack.isEmpty() && stack.peek()[0] <= price) {
            count += stack.pop()[1];
        }
        stack.push(new int[]{price, count});
        return count;
    }   
}
