package leetcode.tree;

import util.TreeNode;

public class MinimumAbsoluteDifferenceInBST {
    TreeNode preNode;
    int res = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorderTraveral(root);
        return res;
    }

    private void inorderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraveral(node.left);
        if (preNode != null) {
            res = Math.min(res, node.val - preNode.val);
        }
        preNode = node;
        inorderTraveral(node.right);
    }    
}
