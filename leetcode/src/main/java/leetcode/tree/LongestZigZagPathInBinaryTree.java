package leetcode.tree;

import util.TreeNode;

public class LongestZigZagPathInBinaryTree {
    int res = 0;
    public int longestZigZag(TreeNode root) {
        helper(root, false, 0);
        helper(root, true, 0);
        return res;
    }
    
    private void helper(TreeNode node, boolean isLeft, int path) {
        if (node == null){
            return;
        }
        res = Math.max(res, path);
        if (isLeft) {
            helper(node.left, false, path + 1);
            helper(node.right, true, 1);
        } else {
            helper(node.right, true, path + 1);
            helper(node.left, false, 1);
        }
    }
}
