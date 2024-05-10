package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import util.TreeNode;

public class CheckCompletenessOfBinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        boolean nullNodeFound = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                nullNodeFound = true;
            } else {
                if (nullNodeFound) {
                    return false;
                } else {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }
            }
        }
        return true;
    }    
}
