package leetcode.tree;

import util.TreeNode;

public class CountNodesEqualToAverageOfSubtree {
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }

    private int[] helper(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = helper(node.left);
        int[] right = helper(node.right);
        int curSum = left[0] + right[0] + node.val;
        int curCount = left[1] + right[1] + 1;

        if ((curSum / curCount) == node.val) {
            count++;
        }
        return new int[]{curSum, curCount};
    }    
}
