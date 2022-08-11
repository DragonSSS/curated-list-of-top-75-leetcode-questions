package leetcode.stack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    // 2, 1, + 3, *
    // two stacks
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
}
