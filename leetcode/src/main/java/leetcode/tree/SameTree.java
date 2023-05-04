package leetcode.tree;

import util.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && p.val == q.val;
    }

    // dfs - O(n)
    public boolean isSameTree_2r(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        
        if(p == null || q == null)
            return false;
        
        return isSameTree_2r(p.left, q.left) && isSameTree_2r(p.right, q.right) && p.val == q.val;
    }

    public boolean isSameTree_3r(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        
        if (p == null || q == null)
            return false;
        
        return p.val == q.val && isSameTree_3r(p.left, q.left) && isSameTree_3r(p.right, q.right);
    }

    public boolean isSameTree_4r(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree_4r(p.left, q.left) && isSameTree_4r(p.right, q.right);
        }
    }
}
