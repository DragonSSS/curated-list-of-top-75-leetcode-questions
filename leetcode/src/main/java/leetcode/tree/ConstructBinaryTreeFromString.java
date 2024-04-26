package leetcode.tree;

import java.util.Stack;
import util.TreeNode;

public class ConstructBinaryTreeFromString {
    // s = "-4(2(3)(1))(6(5))"
    public TreeNode str2tree(String s) {
        Stack<TreeNode> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);   
            if (c == ')') {
                stack.pop();
            } else if ((c >= '0' && c <= '9') || c == '-') {
                int left = i;
                while(i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                    i++;
                }
                TreeNode node = new TreeNode(Integer.valueOf(s.substring(left, i + 1)));
                if (!stack.isEmpty()) {
                    TreeNode parent = stack.peek();
                    if (parent.left != null) {
                        parent.right = node; 
                    } else {
                        parent.left = node;
                    }
                }
                stack.push(node);
            }
        }
        return stack.isEmpty() ? null : stack.peek();
    }    
}
