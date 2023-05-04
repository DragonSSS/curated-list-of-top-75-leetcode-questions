package leetcode.tree;

import util.TreeNode;;

public class DiameterOfBinaryTree {
    int res = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return res;
    }
    
    private int helper(TreeNode node) {
        // at least we have one node in the tree
        if (node == null)
            return -1;
        
        int left = helper(node.left) + 1;
        int right= helper(node.right) + 1;
        res = Math.max(res, left + right);
        
        return Math.max(left, right);
    }
    
    int result = 0;
    public int diameterOfBinaryTree_2r(TreeNode root) {
        helper_2r(root);
        return result;
    }

    private int helper_2r(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = helper_2r(node.left);
        int right = helper_2r(node.right);

        res = Math.max(res, left + right);

        return Math.max(left, right) + 1;
    }
}
