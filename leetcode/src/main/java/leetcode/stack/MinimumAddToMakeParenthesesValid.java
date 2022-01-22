package leetcode.stack;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        // two operations options:
        // add "(" or add ")"
        int addLeft = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    addLeft++;
                }
            }
        }
        
        return stack.size() + addLeft;
    }   
}
