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
    
    private int helper_2r(TreeNode node, int sum) {
        // if we have only one side of tree
        // if (node == null)
        //     return 0;
        
        int curSum = sum * 10 + node.val;
        
        // when reach the leaf, should return current sum
        if (node.left == null && node.right == null)
            return curSum;
        
        return (node.left == null ? 0 : helper(node.left, curSum)) +
             (node.right == null ? 0 : helper(node.right, curSum));
    }
}
