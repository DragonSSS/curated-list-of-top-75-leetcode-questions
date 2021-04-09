package leetcode.tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindLeavesOfBinaryTree {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res);
        root = null;
        return res;
    }

    private int helper(TreeNode node, List<List<Integer>> res) {
        if (node == null)
            return -1;

        int level = Math.max(helper(node.left, res), helper(node.right, res)) + 1;

        if (res.size() < level + 1) {
            res.add(new ArrayList<>());
        }

        res.get(level).add(node.val);
        node.left = null;
        node.right = null;
        return level;
    }
}
