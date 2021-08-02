package leetcode.tree;

import util.TreeNode;

public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        return helper(root, root.val);
    }

    private int helper(TreeNode node, int max) {
        if (node == null)
            return 0;

        int currentMax = Math.max(max, node.val);
        int currentCount = node.val >= max ? 1 : 0;

        return currentCount + helper(node.left, currentMax) + helper(node.right, currentMax);
    }
}


