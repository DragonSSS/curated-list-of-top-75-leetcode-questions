package leetcode.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import util.TreeNode;

public class DeleteNodesAndReturnForest {
    Set<Integer> deleteList = new HashSet<>();
    List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int delete : to_delete) {
            deleteList.add(delete);
        }
        helper(root, true);
        return res;
    }

    private TreeNode helper(TreeNode node, boolean isRoot) {
        if (node == null) {
            return null;
        }

        boolean shouldDelete = deleteList.contains(node.val);
        if (isRoot && !shouldDelete) {
            res.add(node);
        }

        node.left = helper(node.left, shouldDelete);
        node.right = helper(node.right, shouldDelete);

        return shouldDelete ? null : node;
    }    
}
