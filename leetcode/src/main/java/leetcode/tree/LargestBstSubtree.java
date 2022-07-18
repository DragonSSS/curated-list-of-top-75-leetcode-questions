package leetcode.tree;

import util.TreeNode;

public class LargestBstSubtree {
    int res = 0;
    public int largestBSTSubtree(TreeNode root) {
        if (root == null) {
            return res;
        }
        helper(root);
        return res;
    }

    // int[] {min, max, currentSize}
    private int[] helper(TreeNode node) {
        if (node == null) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }

        int[] left = helper(node.left);
        int[] right = helper(node.right);

        // isValid and update global result
        if (left[1] < node.val && right[0] > node.val) {
            res = Math.max(res, left[2] + right[2] + 1);
            return new int[]{
                Math.min(left[0], node.val),
                Math.max(right[1], node.val),
                left[2] + right[2] + 1
            };
        } else {
            // int[] {min, max, currentSize}
            // to make the the tree with substree invalid as well
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }
    }
}
