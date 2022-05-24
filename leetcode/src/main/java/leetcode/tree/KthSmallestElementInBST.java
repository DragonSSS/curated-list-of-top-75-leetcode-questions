package leetcode.tree;

import util.TreeNode;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

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

    Queue<Integer> queue = new LinkedList<>();
    public int kthSmallest_3r(TreeNode root, int k) {
        helper_3r(root);
        
        int res = 0;
        while(k > 0) {
            res = queue.poll();
            k--;
        }
        return res;
    }
    
    private void helper_3r(TreeNode node) {
        if (node == null)
            return;
        
        helper_3r(node.left);
        queue.offer(node.val);
        helper_3r(node.right);
    }
}
