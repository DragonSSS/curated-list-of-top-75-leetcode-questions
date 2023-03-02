package leetcode.tree;

import util.TreeNode;

public class HouseRobberIII {
    public int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }
    
    private int[] helper(TreeNode node) {
        if (node == null)
            return new int[2];
        
        // cur[0]: rob
        // cur[1]: non-rob
        int[] cur = new int[2];
        
        int[] left = helper(node.left);
        int[] right = helper(node.right);
        
        // rob this node
        cur[0] = node.val + left[1] + right[1];
        // not rob this node
        cur[1] = Math.max(left[0], left[1]) +  Math.max(right[0], right[1]);
        
        return cur;
    }    
}
