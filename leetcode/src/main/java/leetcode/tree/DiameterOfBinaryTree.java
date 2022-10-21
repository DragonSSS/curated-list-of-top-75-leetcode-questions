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
}
