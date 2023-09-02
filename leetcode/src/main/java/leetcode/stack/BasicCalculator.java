package leetcode.stack;

import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<Character> ops = new Stack<>();
        // if it is -(1 + 1) => 0 - (1 + 1)
        if (s.charAt(0) == '-') {
            s = "0" + s;
        }
        
        // if it is 1 - (-1 + 2) => 1 - (0 - 1 + 2) 
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '(' && s.charAt(i+1) == '-') {
                s = s.substring(0, i + 1) + "0" + s.substring(i + 1, s.length());
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ')
                continue;
            if (Character.isDigit(c)) {
                int num = c - '0';
                while(i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                nums.push(num);
            } else if(c == '('){
                ops.push(c);
            } else if(c == ')'){
                while(!ops.isEmpty() && ops.peek() != '(') {
                    nums.push(operation(ops.pop(), nums.pop(), nums.pop()));
                }
                ops.pop();
            } else {
                while(!ops.isEmpty()&& ops.peek() != '(') {
                    nums.push(operation(ops.pop(), nums.pop(), nums.pop()));
                }
                ops.push(c);
            }
        }
        
        while(!ops.isEmpty()) {
            nums.push(operation(ops.pop(), nums.pop(), nums.pop()));
        }
        
        return nums.peek();
    }
    
    private int operation(char op, int num1, int num2) {
        if (op == '+') {
            return num1 + num2;
        } else {
            return num2 - num1;
        }
    }    
}
