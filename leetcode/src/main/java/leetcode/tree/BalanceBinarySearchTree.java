package leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import util.TreeNode;

public class BalanceBinarySearchTree {
    List<TreeNode> nodes = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        // in-order traversal
        inorderTraversal(root);
        // reconstruct balanced BST
        return reconstruct(0, nodes.size() - 1);
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        nodes.add(node);
        inorderTraversal(node.right);
    }

    private TreeNode reconstruct(int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = nodes.get(mid);
        root.left = reconstruct(start, mid - 1);
        root.right = reconstruct(mid + 1, end);
        return root;
    }    
}
