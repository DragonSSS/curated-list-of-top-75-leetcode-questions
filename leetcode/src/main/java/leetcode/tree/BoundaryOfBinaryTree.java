package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class BoundaryOfBinaryTree {
    List<Integer> res = new ArrayList<>();
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        
        if (root == null)
            return res;
        res.add(root.val);
        findLeft(root.left);
        findLeaves(root.left);
        findLeaves(root.right);
        findRight(root.right);
        return res;
    }
    
    private void findLeft(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }
        res.add(node.val);
        if(node.left == null) {
            findLeft(node.right);
        } else {
            findLeft(node.left);
        }
    }
    
    private void findRight(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }
        if(node.right == null) {
            findRight(node.left);
        } else {
            findRight(node.right);
        }
        res.add(node.val);
    }
    
    private void findLeaves(TreeNode node) {
        if (node == null)
            return;
        
        if (node.left == null && node.right == null) {
            res.add(node.val);
            return;
        }
        findLeaves(node.left);
        findLeaves(node.right);
    }    
}
