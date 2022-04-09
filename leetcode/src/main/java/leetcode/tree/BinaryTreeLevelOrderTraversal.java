package leetcode.tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
}
