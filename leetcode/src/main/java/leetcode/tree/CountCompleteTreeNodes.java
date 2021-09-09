package leetcode.tree;

import util.TreeNode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = findLeftHeight(root);
        int rightHeight = findRightHeight(root);

        if (leftHeight == rightHeight) {
            // number of nodes =  2^h - 1
            return (1 << leftHeight) - 1;
        } else {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }

    private int findLeftHeight(TreeNode node) {
        int height = 0;

        while(node != null) {
            height++;
            node = node.left;
        }

        return height;
    }

    private int findRightHeight(TreeNode node) {
        int height = 0;

        while(node != null) {
            height++;
            node = node.right;
        }

        return height;
    }
}
