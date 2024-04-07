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
    
    public String minRemoveToMakeValid_2r(String s) {
        Set<Integer> removed = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            
            if (cur == '(') {
                stack.push(i);
            } else if (cur == ')') {
                if(stack.isEmpty()) {
                    removed.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty()) {
            removed.add(stack.pop());
        }
        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(removed.contains(i))
                continue;
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }

    // stack to track the parentheses
    public String minRemoveToMakeValid_3r(String s) {
        Set<Integer> remove = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            if (cur == '(') {
                stack.push(i);
            } else if (cur == ')') {
                if(stack.isEmpty()) {
                    remove.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty()) {
            remove.add(stack.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if(!remove.contains(i)) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

    // "lee(t(c)o)de)"
    public String minRemoveToMakeValid_4r(String s) {
        Set<Integer> remove = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur ==  '(')  {
                stack.push(i);
            } else if (cur == ')') {
                if (stack.isEmpty()) {
                    remove.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()) {
            remove.add(stack.pop());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if (!remove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
