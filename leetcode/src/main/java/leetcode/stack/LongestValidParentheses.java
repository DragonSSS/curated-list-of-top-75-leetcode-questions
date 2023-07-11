package leetcode.stack;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int res = 0;
        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    start = i + 1;
                } else {
                    stack.pop();
                    if(stack.isEmpty()) {
                        // ()))
                        res = Math.max(res, i - start + 1);
                    } else {
                        // ((()
                        res = Math.max(res, i - stack.peek());
                    }
                }
            }
        }
        return res;
    }    
}
