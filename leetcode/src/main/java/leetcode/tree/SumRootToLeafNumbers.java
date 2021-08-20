package leetcode.tree;

import util.TreeNode;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode node, int sum) {
        if (node == null)
            return 0;
        int currentSum = sum * 10 + node.val;

        if (node.left == null && node.right == null)
            return currentSum;

        return helper(node.left, currentSum) + helper(node.right, currentSum);
    }
}
