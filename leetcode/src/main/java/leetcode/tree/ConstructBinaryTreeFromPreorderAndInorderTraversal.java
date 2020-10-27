package leetcode.tree;

import util.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode helper(int preIndex, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preIndex >= preorder.length || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preIndex]);

        for(int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                // current index of root in inorder
                int inIndex = i;
                root.left = helper(preIndex + 1, inStart, inIndex - 1, preorder, inorder);
                root.right = helper(preIndex + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
            }
        }
        return root;
    }
}
