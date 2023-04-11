package leetcode.tree;

import java.util.Stack;
import util.TreeNode;

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
        if (root == null)
            return true;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;

        while(root != null || !stack.isEmpty()) {

            // one way
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode cur = stack.pop();
            if (pre != null && cur.val <= pre.val)
                return false;
            pre = cur;
            root = cur.right;

            // the other way
            /*
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();

                if (pre != null && pre.val >= root.val)
                    return false;
                pre = root;
                root = root.right;
            }*/
        }
        return true;
    }

        // dfs
    public boolean isValidBST_2r(TreeNode root) {
        return helper_2r(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    private boolean helper_2r(TreeNode node, long max, long min) {
        if (node == null)
            return true;
        
        if (node.val >= max || node.val <= min) {
            return false;
        }
        
        return helper_2r(node.left, node.val, min) && helper_2r(node.right, max, node.val);
    }


    public boolean isValidBST_3r(TreeNode root) {
        return helper_3r(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    private boolean helper_3r(TreeNode node, long max, long min) {
        if (node == null)
            return true;
        
        if (node.val >= max || node.val <= min)
            return false;
        
        return helper_3r(node.left, node.val, min) && helper_3r(node.right, max, node.val);
    }

    public boolean isValidBST_4r(TreeNode root) {
        return helper_4r(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean helper_4r(TreeNode node, long max, long min) {
        if (node == null) {
            return true;
        }

        if (node.val >= max || node.val <= min) {
            return false;
        }

        return helper_4r(node.left, node.val, min) && helper_4r(node.right, max, node.val);
    }
}