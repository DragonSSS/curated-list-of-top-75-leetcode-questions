package leetcode.tree;

import util.TreeNode;

public class RecoverBinarySearchTree {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode previous = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        find(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void find(TreeNode node) {
        if (node == null)
            return;

        find(node.left);

        if (first == null && previous.val > node.val) {
            first = previous;
        }

        if (first != null && previous.val > node.val) {
            second = node;
        }

        previous = node;

        find(node.right);
    }
}
