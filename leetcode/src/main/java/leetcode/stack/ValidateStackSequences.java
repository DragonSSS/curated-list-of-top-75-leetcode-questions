package leetcode.stack;

import java.util.Stack;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       Stack<Integer> stack = new Stack<>();
       int index = 0;
       for(int val : pushed) {
           stack.push(val);
           while(!stack.isEmpty() && stack.peek() == popped[index]) {
               stack.pop();
               index++;
           }
       }
       return stack.isEmpty();
    }    
}
