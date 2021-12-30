package leetcode.design;

import java.util.Stack;

public class MaxStack {
    Stack<Integer> stack;
    Stack<Integer> maxStack;

    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        if (maxStack.isEmpty() || x > maxStack.peek()) {
            maxStack.push(x);
        } else {
            maxStack.push(maxStack.peek());
        }
    }
    
    public int pop() {
        maxStack.pop();
        return stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int peekMax() {
        return maxStack.peek();
    }
    
    public int popMax() {
        int curMax = this.peekMax();
        Stack<Integer> stackHelper = new Stack<>();
        // take out
        while(this.top() != curMax) {
            stackHelper.push(this.pop());
        }
        pop(); // remove current max
        // put back
        while(!stackHelper.isEmpty()) {
            this.push(stackHelper.pop());
        }
        return curMax;
    }
}
