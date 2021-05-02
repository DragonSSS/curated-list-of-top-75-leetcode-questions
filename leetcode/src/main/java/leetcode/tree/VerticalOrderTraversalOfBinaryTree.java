package leetcode.tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class VerticalOrderTraversalOfBinaryTree {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        // edge case
        if(root == null)
            return res;

        Map<Integer, Map<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        // O(nlogn)
        helper(root, 0, 0 , map);

        for(Map<Integer, PriorityQueue<Integer>> subMap : map.values()) {
            res.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq : subMap.values()) {
                while(!pq.isEmpty()) {
                    // O(logn)
                    res.get(res.size() - 1).add(pq.poll());
                }
            }
        }
        return res;
    }

    private void helper(TreeNode node, int hor, int ver, Map<Integer, Map<Integer, PriorityQueue<Integer>>> map) {
        if (node == null)
            return;

        map.putIfAbsent(hor, new TreeMap<>());
        map.get(hor).putIfAbsent(ver, new PriorityQueue<>());
        // O(logn)
        map.get(hor).get(ver).offer(node.val);

        helper(node.left, hor - 1, ver + 1, map);
        helper(node.right, hor + 1, ver + 1, map);
    }
}
