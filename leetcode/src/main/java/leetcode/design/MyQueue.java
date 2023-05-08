package leetcode.design;

import java.util.Stack;

public class MyQueue {
    Stack<Integer>  input;
    Stack<Integer> output;
    public MyQueue() {
         input = new Stack<>();
         output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        this.peek();
        return output.pop();
    }
    
    public int peek() {
        if(output.isEmpty()) {
            while(!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }    
}
