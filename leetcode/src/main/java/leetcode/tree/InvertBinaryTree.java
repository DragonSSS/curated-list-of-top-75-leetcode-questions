package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import util.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;

            if (cur.left != null)
                queue.offer(cur.left);

            if (cur.right != null)
                queue.offer(cur.right);
        }

        return root;
    }

    // dfs - O(n)
    public TreeNode invertTree_2r(TreeNode root) {
        if(root == null)
            return null;
        
        TreeNode left = invertTree_2r(root.left);
        TreeNode right = invertTree_2r(root.right);
        
        root.left = right;
        root.right = left;
        
        return root;
    }

    public TreeNode invertTree_3r(TreeNode root) {
        if(root == null)
            return root;
        
        TreeNode left = invertTree_3r(root.left);
        TreeNode right = invertTree_3r(root.right);
        
        root.right = left;
        root.left = right;
        return root;
    }

    public TreeNode invertTree_4r(TreeNode root) {
        if(root == null) {
            return root;
        }

        TreeNode left = invertTree_4r(root.left);
        TreeNode right = invertTree_4r(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
