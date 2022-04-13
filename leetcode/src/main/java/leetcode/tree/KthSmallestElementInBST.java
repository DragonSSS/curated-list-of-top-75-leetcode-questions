package leetcode.tree;

import util.TreeNode;
import java.util.List;
import java.util.ArrayList;

public class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        // inorder traversal
        helper(root, res);
        return res.get(k - 1);
    }

    private void helper(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
    }

    // inorder traversal + dfs
    int res = 0;
    public int kthSmallest_2r(TreeNode root, int k) {
        helper(root, k);
        return res;
    }
    
    private int helper(TreeNode node, int k) {
        if (node == null) {
            return k;
        }
        
        k = helper(node.left, k);
        k--;
        if (k == 0) {
            res = node.val;
            return k;
        }
        k = helper(node.right, k);
        return k;
    }
}
