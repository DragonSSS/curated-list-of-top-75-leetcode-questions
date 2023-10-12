package leetcode.tree;

import util.TreeNode;

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) {
                return root.right;
            }
            
            if (root.right == null) {
                return root.left;
            }
            
            TreeNode minNode = root.right;
            while(minNode.left != null) {
                minNode = minNode.left;
            }
            
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        }
        return root;
    }    
}
