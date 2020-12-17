package leetcode.graph;

import org.junit.Assert;
import org.junit.Test;

public class TestGraphValidTree {

    @Test
    public void testValidTree() {
        int[][] dataTrue = new int[][]{{0,1}, {0,2}, {0,3}, {1,4}};
        int nTrue = 5;

        int[][] dataFalse = new int[][]{{0,1}, {1,2}, {2,3}, {1,3}, {1,4}};
        int nFalse = 5;

        Assert.assertEquals(true, new GraphValidTree().validTree(nTrue, dataTrue));
        Assert.assertEquals(false, new GraphValidTree().validTree(nFalse, dataFalse));

        Assert.assertEquals(true, new GraphValidTree().validTreeBFS(nTrue, dataTrue));
        Assert.assertEquals(false, new GraphValidTree().validTreeBFS(nFalse, dataFalse));
    }
}
