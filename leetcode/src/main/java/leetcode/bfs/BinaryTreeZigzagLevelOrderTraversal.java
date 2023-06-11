package leetcode.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import util.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder_BFS(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (flag) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            flag = !flag;
            if (!list.isEmpty()) {
                res.add(list);
            }
        }

        return res;
    }

    public List<List<Integer>> zigzagLevelOrder_DFS(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        helper(root, 0, res);
        return res;
    }

    private void helper(TreeNode node, int level, List<List<Integer>> res) {
        if (node == null)
            return;

        if (res.size() <= level) {
            res.add(new ArrayList<>());
        }

        if (level % 2 == 0) {
            res.get(level).add(node.val);
        } else {
            res.get(level).add(0, node.val);
        }

        helper(node.left, level + 1, res);
        helper(node.right, level + 1, res);
    }

    // bfs or dfs
    public List<List<Integer>> zigzagLevelOrder_2r(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean flag = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(flag) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            flag = !flag;
            if(!list.isEmpty()) {
                res.add(list);
            }
        }
        return res;
    }
}
