package leetcode.stack;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (k >= num.length())
            return "0";
        
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while(index < num.length()) {
            while(k > 0 && !stack.isEmpty() && num.charAt(index) < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(index));
            index++;
        }
        
        // edge case, same chars
        while(k > 0) {
            stack.pop();
            k--;
        }
        
        // reconstruct string
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            char c = stack.pop();
            sb.append(c);
        }
        sb.reverse();
        
        // cleanup leading '0'
        while(sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}
