package leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import util.TreeNode;

public class FinDuplicateSubtrees {
    List<TreeNode> res = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        helper(root);
        return res;
    }

    private String helper(TreeNode node) {
        if (node == null) {
            return "#";
        }

        String s = node.val + ",";
        s += helper(node.left)  + ",";
        s += helper(node.right);
        
        map.put(s, map.getOrDefault(s, 0) + 1);
        if (map.get(s) == 2) {
            res.add(node);
        }
        return s;
    }    
}
