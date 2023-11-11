package leetcode.tree;

import java.util.HashMap;
import java.util.Map;
import util.TreeNode;

public class MaximumLevelSumOfBinaryTree {
    public int maxLevelSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, 1, map);
        int curVal = Integer.MIN_VALUE;
        int res = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > curVal) {
                res = entry.getKey();
                curVal = entry.getValue();
            }
        }
        return res;
    }

    private void helper(TreeNode node, int level, Map<Integer, Integer> map) {
        if (node == null) {
            return;
        }
        map.put(level, map.getOrDefault(level, 0) + node.val);
        helper(node.left, level + 1, map);
        helper(node.right, level + 1, map);
    }    
}
