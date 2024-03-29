package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import util.TreeNode;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            List<Integer> subRes = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                subRes.add(cur.val);

                if(cur.left != null)
                    queue.offer(cur.left);
                if(cur.right != null)
                    queue.offer(cur.right);
            }
            res.add(subRes);
        }
        return res;
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder_2r(TreeNode root) {
        helper(root, 0);
        return res;
    }
    
    private void helper(TreeNode node, int level) {
        if (node == null)
            return;
        
        if (res.size() <= level) {
            res.add(new ArrayList<>());
        }
        
        res.get(level).add(node.val);
        helper(node.left, level + 1);
        helper(node.right, level + 1);
    }

    public List<List<Integer>> levelOrder_3r(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            List<Integer> cur = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                cur.add(node.val);
                
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(cur);
        }
        
        return res;
    }

    // List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder_4r(TreeNode root) {
        if (root == null) {
            return res;
        }
        helper_4r(root, 0);
        return res;
    }

    private void helper_4r(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (res.size() <= level) {
            res.add(new ArrayList<>());
        }

        res.get(level).add(node.val);
        helper(node.left, level + 1);
        helper(node.right, level + 1);
    }
}
