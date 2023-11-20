package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import util.TreeNode;

public class DeepestLeaveSum {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            res = 0;
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                res+= cur.val;
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
        return res;
    }    
}
