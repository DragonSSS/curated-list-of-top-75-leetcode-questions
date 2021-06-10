package leetcode.tree;

import util.TreeNode;

public class DistributeCoinsInBinaryTree {
    private int count = 0;
    public int distributeCoins(TreeNode root) {
        helper(root);
        return count;
    }

    private int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // post-order traversal
        int left = helper(node.left);
        int right = helper(node.right);

        int temp = left + right + node.val - 1;

        count += Math.abs(temp);

        return temp;
    }
}
