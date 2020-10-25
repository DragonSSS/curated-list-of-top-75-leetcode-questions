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
}
