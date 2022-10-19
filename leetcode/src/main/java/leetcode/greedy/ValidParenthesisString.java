package leetcode.greedy;

import java.util.Stack;

public class ValidParenthesisString {
    // solution 1 - stacks
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

    // solution 2 - greedy
    public boolean checkValidString_greedy(String s) {
        int leftMin = 0, leftMax = 0;
        for(char c : s.toCharArray()) {
            if (c == '(') {
                leftMin++;
                leftMax++;
            } else if (c == ')') {
                if (leftMin > 0) 
                    leftMin--;
                leftMax--;
            } else {
                if (leftMin > 0) 
                    leftMin--;
                leftMax++;
            }
            if (leftMax < 0)
                return false;
        }
        return leftMin == 0;
    } 
}
