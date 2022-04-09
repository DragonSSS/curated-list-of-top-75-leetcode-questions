package leetcode.tree;

import util.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);

        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    // dfs - O(n)
    public int maxDepth_2r(TreeNode root) {
        if (root == null)
            return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left, right) + 1;
    }
}
