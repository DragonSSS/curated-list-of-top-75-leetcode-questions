package leetcode.tree;

import util.TreeNode;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);
    }

    private int helper (TreeNode node, boolean isLeft) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null) {
            if (isLeft)
                return node.val;
            else
                return 0;
        }

        return helper(node.left, true) + helper(node.right, false);
    }
}
