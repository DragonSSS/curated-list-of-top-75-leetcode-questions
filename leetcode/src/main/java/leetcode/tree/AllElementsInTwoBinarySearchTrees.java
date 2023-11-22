package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import util.TreeNode;

public class AllElementsInTwoBinarySearchTrees {
    // inorder traversal + queue iteration
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        helper(root1, queue1);
        helper(root2, queue2);
        List<Integer> res = new ArrayList<>();

        while(!queue1.isEmpty() || !queue2.isEmpty()) {
            if (queue1.isEmpty()) {
                res.add(queue2.poll());
            } else if (queue2.isEmpty()) {
                res.add(queue1.poll());
            } else {
                res.add(queue1.peek() > queue2.peek()? queue2.poll() : queue1.poll());
            }
        }
        return res;
    }

    private void helper(TreeNode node, Queue<Integer> queue) {
        if (node == null) {
            return;
        }
        helper(node.left, queue);
        queue.offer(node.val);
        helper(node.right, queue);
    }    
}
