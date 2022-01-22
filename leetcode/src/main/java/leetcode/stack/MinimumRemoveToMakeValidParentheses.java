package leetcode.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    // use stack to push index of "("
    // pop index of "(" if see ")", record index ")" if stack is empty
    // any index of "(" in stack left, need to remove
    // any recorded index ")", need to remove
    public String minRemoveToMakeValid(String s) {
        StringBuilder res = new StringBuilder();
        Set<Integer> removed = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    removed.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty()) removed.add(stack.pop());
        
        for (int i = 0; i < s.length(); i++) {
            if (removed.contains(i)) continue;
            res.append(s.charAt(i));
        }
        return res.toString();
    }    
}
