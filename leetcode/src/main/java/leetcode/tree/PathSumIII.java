package leetcode.tree;

import java.util.HashMap;
import java.util.Map;
import util.TreeNode;

public class PathSumIII {

    // O(n^2)
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return countSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int countSum(TreeNode root, int target) {
        if (root == null) 
            return 0;
        int count = 0;
        if (root.val == target)
            count++;
        
        count += countSum(root.left, target - root.val);
        count += countSum(root.right, target - root.val);
        
        return count;
    }

    // O(n)
    // prefix sum + hashtable + preorder + backtracking
    Map<Long, Integer> map = new HashMap<>();
    int res = 0;
    int target;
    public int pathSum_2r(TreeNode root, int targetSum) {
        target = targetSum;
        helper_2r(root, 0L);
        return res;
    }

    private void helper_2r(TreeNode node, long curSum) {
        if (node == null) {
            return;
        }

        curSum += node.val;
        if (curSum == target) {
            res++;
        }

        res+= map.getOrDefault(curSum - target, 0);

        map.put(curSum, map.getOrDefault(curSum, 0) + 1);

        helper_2r(node.left, curSum);
        helper_2r(node.right, curSum);

        // reach the end of path, remove the prefixSum, continue to process the diff branch
        map.put(curSum, map.get(curSum) - 1);
    }

    // prefix + preorder +
    // Map<Long, Integer> map = new HashMap<>();
    // int res = 0;
    // int target;
    public int pathSum_3r(TreeNode root, int targetSum) {
        target = targetSum;
        helper_3r(root, 0L);
        return res;
    }

    private void helper_3r(TreeNode node, long curSum) {
        if(node == null) {
            return;
        }

        curSum += node.val;

        if (curSum == target) {
            res++;
        }

        res+= map.getOrDefault(curSum - target, 0);
        map.put(curSum, map.getOrDefault(curSum, 0) + 1);

        helper_3r(node.left, curSum);
        helper_3r(node.right, curSum);
        map.put(curSum, map.get(curSum) - 1);
        return;
    }
}
