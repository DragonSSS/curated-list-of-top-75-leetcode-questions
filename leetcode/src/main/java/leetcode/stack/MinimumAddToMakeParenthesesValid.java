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

    public int minAddToMakeValid_2r(String s) {
        Stack<Character> stack = new Stack<>();
        int addLeft = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    addLeft++;
                } else {
                    stack.pop();
                }
            }
        }
        
        return addLeft + stack.size();
    }
}
