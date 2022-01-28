package leetcode.stack;

import java.util.Stack;

public class BasicCalculatorIII {
    // 2*(5+5*2)/3+(6/2+8)
    public int calculate(String s) {
        Stack<Integer> nums = new Stack<>(); // numbers
        Stack<Character> ops = new Stack<>(); // operators and parenthese
        
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (Character.isDigit(cur)) {
                int num = cur - '0';
                while(i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                nums.push(num);
            } else if (cur == '(') {
                ops.push(cur);
            } else if (cur == ')') {
                while(ops.peek() != '(') {
                    nums.push(operation(ops.pop(), nums.pop(), nums.pop()));
                }
                ops.pop();
            } else {
                // check priority of operators
                while(!ops.isEmpty() && compareOps(ops.peek(), cur)) {
                    nums.push(operation(ops.pop(), nums.pop(), nums.pop()));
                }
                ops.push(cur);
            }
        }
        
        while(!ops.isEmpty()) {
            nums.push(operation(ops.pop(), nums.pop(), nums.pop()));
        }
        
        return nums.peek();
    }
    
    private int operation(char op, int a, int b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                return b / a;
        }
        return 0;
    }
    
   private boolean compareOps(char op1, char op2) {
    if (op1 == '(' || op1 == ')')
      return false;
    return op1 == '*' || op1 == '/' || op2 == '+' || op2 == '-';
  }     
}
