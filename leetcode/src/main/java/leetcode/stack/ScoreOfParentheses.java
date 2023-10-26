package leetcode.stack;

import java.util.Stack;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(-1);
            } else {
                int curSum = 0;
                while(!stack.isEmpty() && stack.peek() != -1) {
                    curSum += stack.pop();
                }
                stack.pop();
                stack.push(curSum == 0? 1 : 2 * curSum);
            }
        }

        int res = 0;
        while(!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }    
}
