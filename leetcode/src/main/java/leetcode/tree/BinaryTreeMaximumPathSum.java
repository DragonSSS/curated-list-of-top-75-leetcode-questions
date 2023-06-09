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

    // dfs - O(n)
    int res = Integer.MIN_VALUE;
    public int maxPathSum_2r(TreeNode root) {
        helper(root);
        return res;
    }
    
    private int helper(TreeNode node) {
        if (node == null)
            return 0;
        
        int left = helper(node.left);
        int right = helper(node.right);
        
        int nodeMax = Math.max(node.val, Math.max(node.val + left, node.val + right));
        
        res = Math.max(res, Math.max(nodeMax, left + node.val + right));
        return nodeMax;   
    }

    // int res = Integer.MIN_VALUE;
    public int maxPathSum_3r(TreeNode root) {
        helper_3r(root);
        return res;
    }
    
    private int helper_3r(TreeNode node) {
        if (node == null)
            return 0;
        
        int left = helper_3r(node.left);
        int right = helper_3r(node.right);
        
        int cur = Math.max(node.val, Math.max(left + node.val, right + node.val));
        res = Math.max(res, Math.max(cur, left + node.val + right));
        return cur;
    }

    // dfs
    // int res = Integer.MIN_VALUE;
    public int maxPathSum_4r(TreeNode root) {
        helper_4r(root);
        return res;
    }

    private int helper_4r(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = helper_4r(node.left);
        int right = helper_4r(node.right);
        int cur = Math.max(node.val, Math.max(node.val + left, node.val + right));
        res = Math.max(res, Math.max(cur, node.val + left + right));
        return cur;
    }
}
