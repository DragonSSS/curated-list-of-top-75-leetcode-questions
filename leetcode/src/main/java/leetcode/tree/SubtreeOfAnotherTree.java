package leetcode.tree;

import util.TreeNode;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null)
            return false;

        if (isSameTree(s, t))
            return true;

        // recursively visit left and right branches
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    // same tree
    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;

        if (s == null || t == null)
            return false;

        return s.val == t.val
                && isSameTree(s.left, t.left)
                && isSameTree(s.right, t.right);
    }

    public boolean isSubtree_2r(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;
        
        if (root == null || subRoot == null)
            return false;
        
        if (isSameTree_2r(root, subRoot))
            return true;
        
        return isSubtree_2r(root.left, subRoot) || isSubtree_2r(root.right, subRoot);
    }
    
    private boolean isSameTree_2r(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        
        if (node1 == null || node2 == null)
            return false;
        
        return isSameTree_2r(node1.left, node2.left) && isSameTree_2r(node1.right, node2.right) && node1.val == node2.val;
    }
}
