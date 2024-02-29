package leetcode.tree;

import java.util.Stack;
import util.TreeNode;

public class BinarySearchTreeToGreaterSumTree {
    // 0, 1, 2, 3, 4, 5, 6, 7, 8
    // 36,35,33,30,26,21,15,8
    public TreeNode bstToGst(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int prefix = 0;
        inorder(root, stack);
        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            cur.val += prefix;
            prefix = cur.val;
        }
        return root;
    }

    private void inorder(TreeNode node, Stack<TreeNode> stack) {
        if (node == null) {
            return;
        }
        inorder(node.left, stack);
        stack.push(node);
        inorder(node.right, stack);
    }

    int pre = 0;
    public TreeNode bstToGst_2r(TreeNode root) {
        if(root == null) {
            return root;
        }
        bstToGst(root.right);
        root.val += pre;
        pre = root.val;
        bstToGst(root.left);
        return root;
    }
}
