package leetcode.tree;

import util.TreeNode;

public class StepByStepDirectionsFromBinaryTreeNodeToAnother {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lcaNode = findLCA(root, startValue, destValue);
        
        // find path from lca to startValue
        StringBuilder path1 = new StringBuilder();
        findPath(lcaNode, startValue, path1);
        
        // update path1
        for (int i = 0; i < path1.length(); i++) {
            path1.setCharAt(i, 'U');
        }
        
        // find path from lca to destValue
        StringBuilder path2 = new StringBuilder();
        findPath(lcaNode, destValue, path2);
        
        return path1.append(path2).toString();
    }
    
    private TreeNode findPath(TreeNode node, int destVal, StringBuilder path) {
        if (node == null)
            return null;
        if (node.val == destVal)
            return node;
        
        TreeNode left = findPath(node.left, destVal, path.append("L"));
        if (left != null )
            return left;
        
        // backtracking
        path.replace(path.length() - 1, path.length(), "");
        
        TreeNode right = findPath(node.right, destVal, path.append("R"));
        if (right != null )
            return right;
        
        // backtracking
        path.replace(path.length() - 1, path.length(), "");
        
        return null;
    }
    
    // find LCA node
    private TreeNode findLCA(TreeNode node, int nodeVal1, int nodeVal2) {
        if (node == null || node.val == nodeVal1 || node.val == nodeVal2)
            return node;
        
        TreeNode left = findLCA(node.left, nodeVal1, nodeVal2);
        TreeNode right = findLCA(node.right, nodeVal1, nodeVal2);
        
        if (left == null)
            return right;
        
        if (right == null)
            return left;
        
        return node;
    }    
}
