package leetcode.dfs;

import java.util.List;

public class NestedListWeightSum {
    public int depthSum(List<NestedInteger> nestedList) {
        return helper(nestedList, 1);
    }

    private int helper(List<NestedInteger> nestedList, int level) {
        int res = 0;

        for (NestedInteger ni : nestedList) {
            res += ni.isInteger()? ni.getInteger() * level : helper(ni.getList(), level + 1);
        }

        return res;
    }
}
