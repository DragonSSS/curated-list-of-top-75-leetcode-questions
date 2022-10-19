package leetcode.greedy;

import java.util.Stack;

public class ValidParenthesisString {
    // solution 1 using stacks
    public boolean checkValidString(String s) {
        Stack<Integer> op = new Stack<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                op.push(i);
            } else if (c == ')') {
                if (!op.isEmpty()) {
                    op.pop();
                } else if (!st.isEmpty()) {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                st.push(i);
            }
        }
        
        while(!op.isEmpty() && !st.isEmpty()) {
            if (op.peek() > st.peek())
                return false;
            op.pop();
            st.pop();
        }
        
        return op.isEmpty();
    }    
}
