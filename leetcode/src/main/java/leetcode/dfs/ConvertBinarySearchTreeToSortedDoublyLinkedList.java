package leetcode.dfs;

import util.TreeNode;

// [ 2, 1, 3 ]
//   1
// 2   3

// inorder traversal
public class ConvertBinarySearchTreeToSortedDoublyLinkedList {
    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return root;

        TreeNode dummy = new TreeNode(0, null, null);
        TreeNode prev = dummy;
        prev = inorder(root, prev);
        // connect head with tail;
        prev.right = dummy.right;
        dummy.right.left = prev;
        return dummy.right;
    }

    private TreeNode inorder(TreeNode node, TreeNode prev) {
        if (node == null) return prev;
        prev = inorder(node.left, prev);
        node.left = prev;
        prev.right = node;
        prev = inorder(node.right, node);
        return prev;
    }

    public TreeNode treeToDoublyList_stack(TreeNode root) {
        return null;
    }
}
