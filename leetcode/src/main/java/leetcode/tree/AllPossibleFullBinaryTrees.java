package leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import util.TreeNode;

public class AllPossibleFullBinaryTrees {
    Map<Integer, List<TreeNode>> memo = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            return new ArrayList<>();
        }

        if (n == 1) {
            return Arrays.asList(new TreeNode(0));
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        List<TreeNode> res = new ArrayList<>();
        for(int i = 1; i <= n - 2; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - 1 - i);

            for(TreeNode l : left) {
                for(TreeNode r : right) {
                    TreeNode node = new TreeNode(0, l, r);
                    res.add(node);
                }
            }
        }
        memo.put(n, res);
        return res;
    }    
}
