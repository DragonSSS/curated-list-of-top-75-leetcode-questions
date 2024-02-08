package leetcode.stack;

import java.util.Stack;

public class MinimumInsertionsToBalanceParenthesesString {
    // ( -> ))
    public int minInsertions(String s) {
        int add = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if(i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    add++;
                }

                if (stack.isEmpty()) {
                    add++;
                } else {
                    stack.pop();
                }
            }
        }
        return add + 2 * stack.size();
    }    
}
