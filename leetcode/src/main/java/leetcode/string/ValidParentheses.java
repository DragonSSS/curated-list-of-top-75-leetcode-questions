package leetcode.string;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 1)
            return false;

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if(!stack.isEmpty()) {
                if (c == '}' && stack.pop() != '{') {
                    return false;
                } else if (c == ']' && stack.pop() != '[') {
                    return false;
                } else if (c == ')' && stack.pop() != '(') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
