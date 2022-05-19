package leetcode.stack;

import java.util.Stack;

public class MinimumNumberOfSwapsToMakeStringBalanced {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for( char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(c);
            } else {
                if(!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        
        int numberOfHalf = stack.size() / 2;
        return (numberOfHalf + 1) / 2;
    }
    // ]][[
    // 2
    // 2 + 1 / 2 = 1
    
    // ][
    // 1
    // 1 + 1 / 2 = 1   
}
