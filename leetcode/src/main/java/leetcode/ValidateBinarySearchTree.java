/**
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:

    2
   / \
  1   3

Input: [2,1,3]
Output: true
Example 2:

    5
   / \
  1   4
     / \
    3   6

Input: [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
*/
package leetcode;

import util.TreeNode;

import java.util.Stack;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max){
        if (root == null)
            return true;

        if (root.val <= min || root.val >= max)
            return false;

        boolean isLeftBST = helper(root.left, min, root.val);
        boolean isRightBST = helper(root.right, root.val, max);

        return isLeftBST && isRightBST;
    }

    public boolean isValidBST_Inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;

        while(root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();

                if (pre != null && pre.val >= root.val)
                    return false;
                pre = root;
                root = root.right;
            }
        }
        return true;
    }
}
