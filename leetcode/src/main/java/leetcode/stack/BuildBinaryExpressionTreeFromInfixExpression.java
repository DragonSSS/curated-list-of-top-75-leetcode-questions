package leetcode.stack;

import java.util.Stack;

public class BuildBinaryExpressionTreeFromInfixExpression {
    class Node {
        char val;
        Node left;
        Node right;
        Node() {this.val = ' ';}
        Node(char val) { this.val = val; }
        Node(char val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // similar to Basic Calculator III
    public Node expTree(String s) {
        // operators stack
        Stack<Character> ops = new Stack<>();
        // nums stack
        Stack<Node> nums = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if(Character.isDigit(cur)) {
                nums.push(new Node(cur));
            } else if (cur == '(') {
                ops.push(cur);
            } else if (cur == ')') {
                while(!ops.isEmpty() && ops.peek() != '(') {
                    nums.push(createNode(ops.pop(), nums.pop(), nums.pop()));
                }
                ops.pop(); // remove '('
            } else { // operators
                while(!ops.isEmpty() && operatorCompare(ops.peek(), cur)) {
                    nums.push(createNode(ops.pop(), nums.pop(), nums.pop()));
                }
                ops.push(cur);
            }
        }
        
        while(!ops.isEmpty()) {
            nums.push(createNode(ops.pop(), nums.pop(), nums.pop()));
        }
        return nums.peek();
    }
    
    private Node createNode(char op, Node num1, Node num2) {
        return new Node(op, num2, num1);
    }
    
    // return true if op1 is higher priority
    private boolean operatorCompare(char op1, char op2) {
        if (op1 == '(') // trick, peek of ops stack could be '('
            return false;
        return op1 == '*' || op1 == '/' || op2 == '+' || op2 == '-';
    }    
}
