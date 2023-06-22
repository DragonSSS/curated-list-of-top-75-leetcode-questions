package leetcode.stack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    // one stack
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();
        Set<String> operatorSet = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        
        for(String token : tokens) {
            if (operatorSet.contains(token)) {
                int operand2 = operands.pop();
                int operand1 = operands.pop();
                operands.push(compute(token, operand1, operand2));
            } else {
                operands.push(Integer.valueOf(token));
            }
        }
        return operands.peek();
    }
    
    private int compute(String operator, int operand1, int operand2) {
        int res;
        switch(operator) {
            case "+":
                res = operand1 + operand2;
                break;
            case "-":
                res = operand1 - operand2;
                break;
            case "*":
                res = operand1 * operand2;
                break;
            case "/":
                res = operand1 / operand2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }

    public int evalRPN_2r(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        Set<String> opsSet = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        for(String token : tokens) {
            if(opsSet.contains(token)) {
                nums.push(compute_2r(token, nums.pop(), nums.pop()));
            } else {
                nums.push(Integer.valueOf(token));
            }
        }
        return nums.peek();
    }

    private int compute_2r(String op, int num1, int num2) {
        if (op.equals("+")) {
            return num1 + num2;
        } else if (op.equals("-")) {
            return num2 - num1; // reverse
        } else if (op.equals("*")) {
            return num1 * num2;
        } else if (op.equals("/")) {
            return num2 / num1; // reverse
        }
        return 0;
    }
}
