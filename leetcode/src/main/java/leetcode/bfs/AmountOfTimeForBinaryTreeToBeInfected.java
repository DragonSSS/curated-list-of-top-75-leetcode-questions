package leetcode.bfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import util.TreeNode;

public class AmountOfTimeForBinaryTreeToBeInfected {
    // convert tree to a undirected graph first
    // bfs from start node
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        buildGraph(root, graph);
        if (graph.size() == 0) {
            return 0;
        }
        Set<Integer> visited = new HashSet<>();
        int res = -1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (graph.containsKey(cur)) {
                    for(int next : graph.get(cur)) {
                        if(!visited.contains(next)) {
                            queue.offer(next);
                            visited.add(next);
                        }
                    }
                }
            }
            res++;
        }

        return visited.size() == graph.size() ? res : -1;
    }

    private void buildGraph(TreeNode node, Map<Integer, Set<Integer>> graph) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            graph.putIfAbsent(node.val, new HashSet<>());
            graph.get(node.val).add(node.left.val);
            graph.putIfAbsent(node.left.val, new HashSet<>());
            graph.get(node.left.val).add(node.val);
        }

        if (node.right != null) {
            graph.putIfAbsent(node.val, new HashSet<>());
            graph.get(node.val).add(node.right.val);
            graph.putIfAbsent(node.right.val, new HashSet<>());
            graph.get(node.right.val).add(node.val);
        }
 
        buildGraph(node.left, graph);
        buildGraph(node.right, graph);
    }
    
    int res = 0;
    public int amountOfTime_dfs(TreeNode root, int start) {
        helper(root, start);
        return res;
    }

    private int helper(TreeNode node, int start) {
        if (node == null) {
            return 0;
        }

        int left = helper(node.left, start);
        int right = helper(node.right, start);

        if (node.val == start) {
            res = Math.max(left, right);
            return -1;
        } else if (left >= 0 && right >= 0) {
            return Math.max(left, right) + 1;
        } else {
            int totatLen = Math.abs(left) + Math.abs(right);
            res = Math.max(res, totatLen);
            return Math.min(left, right) - 1;
        }
    }
}
