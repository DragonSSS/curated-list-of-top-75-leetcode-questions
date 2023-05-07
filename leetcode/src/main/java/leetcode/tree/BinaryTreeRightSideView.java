package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import util.TreeNode;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        // edge-case
        if(root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(i == size - 1)
                    res.add(node.val);
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
        }
        return res;
    }

    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView_2r(TreeNode root) {
        if (root == null) {
            return res;
        }
        helper(root, 0);
        return res;
    }

    private void helper(TreeNode node, int level) {
        // each level only add one TreeNod if exists
        // make sure node is not null
        if (level == res.size()) {
            res.add(node.val);
        }

        if (node.right != null) {
            helper(node.right, level + 1);
        }

        if (node.left != null) {
            helper(node.left, level + 1);
        }
    }
}
