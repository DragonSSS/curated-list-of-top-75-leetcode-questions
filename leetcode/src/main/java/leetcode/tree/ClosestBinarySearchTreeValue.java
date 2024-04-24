package leetcode.tree;

import util.TreeNode;

public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        int res = root.val;
        while(root != null) {
            if(Math.abs(root.val - target) < Math.abs(res - target) || (Math.abs(root.val - target) == Math.abs(res - target) && root.val < res)) {
                res = root.val;
            }
            root = root.val > target ? root.left : root.right;
        }
        return res;
    }    
}
