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

    // 3,9,20,15,7 (in-order)
    // 9,3,15,20,7 (pre-order) 
    // O(n)
    public TreeNode buildTree_3r(int[] preorder, int[] inorder) {
        return helper_3r(0, 0, inorder.length - 1, preorder, inorder);
    }
    
    private TreeNode helper_3r(int preIndex, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preIndex == preorder.length || inStart > inEnd) {
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[preIndex]);
        
        for(int i = inStart; i <= inEnd; i++) {
            if (preorder[preIndex] == inorder[i]) {
                int inIndex = i;
                node.left = helper_3r(preIndex + 1, inStart, inIndex - 1, preorder, inorder);
                node.right = helper_3r(preIndex + inIndex - inStart  + 1, inIndex + 1, inEnd, preorder, inorder);
            }
        }
        
        return node;
    }

    // better and cleaner
    Map<Integer, Integer> inorderMap;
    int preInex;
    public TreeNode buildTree_4r(int[] preorder, int[] inorder) {
        preInex = 0;
        inorderMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        
        return helper_4r(preorder, 0, inorder.length - 1);
    }
    
    private TreeNode helper_4r(int[] preorder, int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }
        
        int nodeVal = preorder[preInex];
        TreeNode node = new TreeNode(nodeVal);
        preInex++;
        
        int inIndex = inorderMap.get(nodeVal);
        node.left = helper_4r(preorder, inLeft, inIndex - 1);
        node.right = helper_4r(preorder, inIndex + 1, inRight);
        return node;
    }

    // Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree_5r(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper_5r(0, 0, inorder.length - 1, preorder);
    }
    
    private TreeNode helper_5r(int indexPre, int startIn, int endIn, int[] preorder) {
        if(indexPre == preorder.length || startIn > endIn) {
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[indexPre]);
        int indexIn = map.get(preorder[indexPre]);
        node.left = helper_5r(indexPre + 1, startIn, indexIn - 1, preorder);
        node.right = helper_5r(indexPre + indexIn - startIn + 1, indexIn + 1, endIn, preorder);
        return node;
    }

    // Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree_6r(int[] preorder, int[] inorder) {
        for(int i  = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper_6r(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode helper_6r(int preIndex, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preIndex >= preorder.length || inStart > inEnd) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[preIndex]);
        int inIndex = map.get(preorder[preIndex]);
        node.left = helper_6r(preIndex + 1, inStart, inIndex - 1, preorder, inorder);
        node.right = helper_6r(preIndex + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        return node;
    }

    // preorder -> root node
    // inorder -> how many nodes in left and right subtree for current node
    // Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree_7r(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper_7r(0, 0, inorder.length - 1, preorder);
    }


    private TreeNode helper_7r(int preIndex,  int inLeft, int inRight, int[] preorder) {
        if (preIndex >= preorder.length || inLeft > inRight) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[preIndex]);
        int inIndex = map.get(preorder[preIndex]);
        node.left = helper_7r(preIndex + 1, inLeft, inIndex - 1, preorder);
        node.right = helper_7r(preIndex + inIndex - inLeft + 1, inIndex + 1, inRight, preorder);
        return node;
    }
}
