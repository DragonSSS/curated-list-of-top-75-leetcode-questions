package leetcode.tree;

import java.util.Stack;
import util.TreeNode;

public class BinarySearchTreeIterator {
    Stack<TreeNode> stack;

    public BinarySearchTreeIterator(TreeNode root) {
        stack = new Stack<>();
        add(root);
    }

    public int next() {
        TreeNode node = stack.pop();
        add(node.right);
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void add(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    // Stack<TreeNode> stack;
    // public BinarySearchTreeIterator_2r(TreeNode root) {
    //     stack = new Stack<>();
    //     add_2r(root);
    // }
    
    public int next_2r() {
        TreeNode node = stack.pop();
        add_2r(node.right);
        return node.val;
    }
    
    public boolean hasNext_2r() {
        return !stack.isEmpty();
    }

    private void add_2r(TreeNode node) {
        while(node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
