package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNumberOfConnectedComponentsInUndirectedGraph {

    @Test
    public void testCountComponents() {
        int n1 = 5;
        int[][] edeges1 = new int[][]{{0,1}, {1,2}, {3,4}};

        int n2 = 5;
        int[][] edeges2 = new int[][]{{0,1}, {1,2}, {2,3}, {3,4}};

        assertEquals(2, new  NumberOfConnectedComponentsInUndirectedGraph().countComponents(n1, edeges1));
        assertEquals(1, new NumberOfConnectedComponentsInUndirectedGraph().countComponents(n2, edeges2));
    }
}
