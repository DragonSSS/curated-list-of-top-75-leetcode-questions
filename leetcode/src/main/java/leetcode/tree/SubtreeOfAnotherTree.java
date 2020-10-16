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
}
