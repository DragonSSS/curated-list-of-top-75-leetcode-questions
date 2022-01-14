package leetcode.design;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * This is the interface for the expression tree Node.
 * You should not remove it, and you can define some classes to implement it.
 */

// abstract class Node {
//     public abstract int evaluate();
// };

class TreeNode {
    String val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(String val) {
        this.val = val;
    }
    
    public int evaluate() {
        return helper(this);
    }
    
    private int helper(TreeNode root) {
        if (root.left == null && root.right == null)
            return Integer.valueOf(root.val);
        
        int left = helper(root.left);
        int right = helper(root.right);
        String op = root.val;
        int res = 0;
        if (op.equals("+")) {
            res = left + right;
        } else if (op.equals("-")) {
            res = left - right;
        } else if (op.equals("*")) {
            res = left * right;
        } else if (op.equals("/")) {
            res = left / right;
        }
        return res;
    }
}

/**
 * This is the TreeBuilder class.
 * You can treat it as the driver code that takes the postinfix input 
 * and returns the expression tree represnting it as a Node.
 */
class TreeBuilder {
    // use stack to build tree
    Set<String> ops = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
    Stack<TreeNode> stack = new Stack<>();
    TreeNode buildTree(String[] postfix) {
        for (String s: postfix) {
            if (ops.contains(s)) {
                TreeNode node = new TreeNode(s);
                node.right = stack.pop();
                node.left = stack.pop();
                stack.push(node);
            } else {
                stack.push(new TreeNode(s));
            }
        }
        return stack.pop();
    }
};
