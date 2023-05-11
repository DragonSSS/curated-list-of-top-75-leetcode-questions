package leetcode.stack;

import java.util.Stack;

public class BasicCalculatorII {
    public int calculate(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ')
                continue;
            
            if (Character.isDigit(c)) {
                int num = c - '0';
                while(i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                nums.push(num);
            } else {
                while(!ops.isEmpty() && opsCompare(ops.peek(), c)) {
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
    
    private boolean opsCompare(char c1, char c2) {
        return c1 == '*' || c1 == '/' || c2 == '+' || c2 == '-';
    }
    
    private int operation(char op, int num1, int num2) {
         if (op == '+') {
             return num1 + num2;
         } else if (op == '-') { 
             return num2 - num1;
         } else if (op == '/') {
             return num2 / num1;
         } else {
             return num2 * num1;
         }
    }

    public int calculate_2r(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                continue;
            }
            if(Character.isDigit(c)) {
                int num = c - '0';
                while((i + 1 < s.length()) && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                numbers.push(num);
            } else {
                while(!operations.isEmpty() && compareOps(operations.peek(), c)) {
                    numbers.push(compute(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(c);
            }
        }

        while(!operations.isEmpty()) {
            numbers.push(compute(operations.pop(), numbers.pop(), numbers.pop()));
        }
        return numbers.peek();
    }

    private boolean compareOps(char op1, char op2) {
        if (op1 == '*' || op1 == '/'|| op2 == '+' || op2 == '-') {
            return true;
        }
        return false;
    }

    private int compute(char op, int num1, int num2) {
        if (op == '*') {
            return num1 * num2;
        } else if (op == '/') {
            return num2 / num1;
        } else if (op == '+') {
            return num1 + num2;
        } else {
            return num2 - num1;
        }
    }
}
