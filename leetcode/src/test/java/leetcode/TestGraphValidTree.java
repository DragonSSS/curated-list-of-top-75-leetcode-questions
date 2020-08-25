package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGraphValidTree {

    @Test
    public void testValidTree() {
        int[][] dataTrue = new int[][]{{0,1}, {0,2}, {0,3}, {1,4}};
        int nTrue = 5;

        int[][] dataFalse = new int[][]{{0,1}, {1,2}, {2,3}, {1,3}, {1,4}};
        int nFalse = 5;

        assertEquals(true, new GraphValidTree().validTree_DFS(nTrue, dataTrue));
        assertEquals(false, new GraphValidTree().validTree_DFS(nFalse, dataFalse));

        assertEquals(true, new GraphValidTree().validTree_BFS(nTrue, dataTrue));
        assertEquals(false, new GraphValidTree().validTree_BFS(nFalse, dataFalse));
    }
}
