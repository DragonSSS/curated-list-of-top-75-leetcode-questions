package leetcode.tree;

import util.TreeNode;

public class BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode node) {
        if (node == null)
            return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        int maxTemp = Math.max(node.val, Math.max(left + node.val, right + node.val));
        max = Math.max(max, Math.max(maxTemp, node.val + left + right));

        return maxTemp;
    }

}
