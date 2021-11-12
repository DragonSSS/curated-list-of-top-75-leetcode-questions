package leetcode.dfs;

import java.util.List;

public class NestedListWeightSumII {
    int max = 0;
    public int depthSumInverse(List<NestedInteger> nestedList) {
        // two passes on nestedList
        // get the max depth by dfs
        // get depthSum by the dfs
        findMaxDepth(nestedList, 1);
        return findDepthSum(nestedList, 1);
    }
    
    private void findMaxDepth(List<NestedInteger> nestedList, int level) {
        max = Math.max(max, level);
        for (NestedInteger ni : nestedList) {
            if (!ni.isInteger()) {
                findMaxDepth(ni.getList(), level + 1);
            }
        }
    }
    
    private int findDepthSum(List<NestedInteger> nestedList, int level) {
        int res = 0;
        for (NestedInteger ni : nestedList) {
            if (ni.isInteger()) {
                res += (max - level + 1) * ni.getInteger();
            } else {
                res += findDepthSum(ni.getList(), level + 1);
            }
        }
        return res;
    }
}
