package leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import util.TreeNode;

public class NumberOfGoodLeafNodesPairs {
    int res = 0;
    public int countPairs(TreeNode root, int distance) {
        helper(root, distance);
        return res;
    }

    private List<Integer> helper(TreeNode node, int distance) {
        if (node == null) {
            return new ArrayList<>();
        }

        if (node.left == null && node.right == null) {
            return Arrays.asList(1);
        }

        List<Integer> leftList = helper(node.left, distance);
        List<Integer> rightList = helper(node.right, distance);

        for(int l : leftList) {
            for(int r : rightList) {
                if (l + r <= distance) {
                    res++;
                }
            }
        }

        List<Integer> cur = new ArrayList<>();
        for(int l : leftList) {
            cur.add(l + 1);
        }
        for(int r : rightList) {
            cur.add(r + 1);
        }

        return cur;
    }    
}
