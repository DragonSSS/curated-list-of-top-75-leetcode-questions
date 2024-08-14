package leetcode.tree;

import util.TreeNode;

public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }

    private void helper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        sb.append(String.valueOf(node.val));
        if (node.left == null && node.right == null) {
            return;
        }
        sb.append("(");
        helper(node.left, sb);
        sb.append(")");
        if (node.right != null) {
            sb.append("(");
            helper(node.right, sb);
            sb.append(")");
        }
    }  
}
