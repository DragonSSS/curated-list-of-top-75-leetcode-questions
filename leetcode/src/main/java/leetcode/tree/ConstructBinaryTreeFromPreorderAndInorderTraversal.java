package leetcode.tree;

import java.util.HashMap;
import java.util.Map;
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

    // preorder to find root node
    // inorder to find left or right node with known root node
    // O(n)
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree_2r(int[] preorder, int[] inorder) {
        // as node val is unique, save value as key, index as map value for inorder;
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper_2r(0, 0, inorder.length - 1, preorder, inorder);
    }
    
    
    private TreeNode helper_2r(int preIndex, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preIndex >= preorder.length || inStart > inEnd) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preIndex]);
        int inIndex = map.get(preorder[preIndex]);
        root.left = helper_2r(preIndex + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = helper_2r(preIndex + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        
        return root;
    }
}
