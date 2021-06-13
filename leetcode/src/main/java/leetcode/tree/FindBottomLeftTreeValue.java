package leetcode.tree;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {
    int res = 0, row = 0;
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 1);
        return res;
    }

    private void helper(TreeNode node, int level) {
        if (row < level) {
            res = node.val; row = level;
        }
        if(node.left != null) helper(node.left, level + 1);
        if(node.right != null) helper(node.right, level + 1);
    }

    public int findBottomLeftValue_bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            root = queue.poll();

            if (root.right != null)
                queue.offer(root.right);

            if(root.left != null)
                queue.offer(root.left);
        }

        return root.val;
    }
}
