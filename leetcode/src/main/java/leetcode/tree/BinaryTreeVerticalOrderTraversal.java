package leetcode.tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTreeVerticalOrderTraversal {
    int min = 0;
    int max = 0;
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;

        dfs(root, 0);

        for (int i = min; i <= max; i++) {
            res.add(new ArrayList<>());
        }

        Queue<TreeNode> queueNodes = new LinkedList<>();
        Queue<Integer> queueIndex = new LinkedList<>();
        queueNodes.offer(root);
        queueIndex.offer(-min);

        while (!queueNodes.isEmpty()) {
            TreeNode node = queueNodes.poll();
            int index = queueIndex.poll();
            res.get(index).add(node.val);

            if(node.left != null) {
                queueNodes.offer(node.left);
                queueIndex.offer(index - 1);
            }

            if(node.right != null) {
                queueNodes.offer(node.right);
                queueIndex.offer(index + 1);
            }
        }

        return res;
    }

    private void dfs(TreeNode node, int index) {
        if(node == null)
            return;
        min = Math.min(min, index);
        max = Math.max(max, index);
        dfs(node.left, index - 1);
        dfs(node.right, index + 1);
    }

    public List<List<Integer>> verticalOrder_hashtable(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        // red black tree, operation O(logn)
        Map<Integer, List<Integer>> map = new TreeMap<>();
        if(root == null)
            return res;

        Queue<TreeNode> queueNodes = new LinkedList<>();
        Queue<Integer> queueIndex = new LinkedList<>();
        queueNodes.offer(root);
        queueIndex.offer(0);

        while (!queueNodes.isEmpty()) {
            TreeNode node = queueNodes.poll();
            int index = queueIndex.poll();

            map.putIfAbsent(index, new ArrayList<>());
            map.get(index).add(node.val);

            if(node.left != null) {
                queueNodes.offer(node.left);
                queueIndex.offer(index - 1);
            }

            if(node.right != null) {
                queueNodes.offer(node.right);
                queueIndex.offer(index + 1);
            }
        }

        res.addAll(map.values());
        return res;
    }
}
