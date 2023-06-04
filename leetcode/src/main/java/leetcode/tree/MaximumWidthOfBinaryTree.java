package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;
import util.TreeNode;

// build tree node index:
// left child index = parent index * 2;
// right child index = parent index * 2 + 1
// width of each level = rightmost index - leftmost index + 1
// e.g.
//                   0

//            0              1
//       0.       1.      2.     3 
//    0.   1.   2   3.  4.  5   6.  7 
public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Integer> indexQ = new LinkedList<>();
        Queue<TreeNode> nodeQ = new LinkedList<>();
        int res = 0;
        indexQ.offer(0);
        nodeQ.offer(root);

        while(!nodeQ.isEmpty()) {
            int size = nodeQ.size();
            int left = 0, right = 0;
            for(int i = 0; i < size; i++) {
                int index = indexQ.poll();
                TreeNode node = nodeQ.poll();
                if(i == 0) {
                    left = index;
                }
                if (i == size - 1) {
                    right = index;
                }
                if(node.left != null) {
                    indexQ.offer(index * 2);
                    nodeQ.offer(node.left);
                }

                if(node.right != null) {
                    indexQ.offer(index * 2 + 1);
                    nodeQ.offer(node.right);
                }
            }

            res = Math.max(res, right - left + 1);
        }
        return res;
    }    
}
