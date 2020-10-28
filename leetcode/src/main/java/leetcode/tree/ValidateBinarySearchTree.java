package leetcode.tree;

import util.TreeNode;

import java.util.Stack;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max){
        if (root == null)
            return true;

        if (root.val <= min || root.val >= max)
            return false;

        boolean isLeftBST = helper(root.left, min, root.val);
        boolean isRightBST = helper(root.right, root.val, max);

        return isLeftBST && isRightBST;
    }

    public boolean isValidBST_Inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;

        while(root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();

                if (pre != null && pre.val >= root.val)
                    return false;
                pre = root;
                root = root.right;
            }
        }
        return true;
    }
}