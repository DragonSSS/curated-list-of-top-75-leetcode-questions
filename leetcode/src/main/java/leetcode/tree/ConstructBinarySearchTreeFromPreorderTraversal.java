package leetcode.tree;

import util.TreeNode;

public class ConstructBinarySearchTreeFromPreorderTraversal {
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode helper(int[] preorder, int left, int right) {
      if (index == preorder.length || preorder[index] <= left || preorder[index] >= right) {
        return null;
      }

      TreeNode node = new TreeNode(preorder[index++]);
      node.left = helper(preorder, left, node.val);
      node.right = helper(preorder, node.val, right);
      return node;
    }    
}
