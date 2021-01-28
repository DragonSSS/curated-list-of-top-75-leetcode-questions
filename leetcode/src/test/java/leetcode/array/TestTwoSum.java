package leetcode.array;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class TestTwoSum {

    @Test
    public void testTwoSum() {
        TwoSum s = new TwoSum();
        int[] result = s.twoSum( new int[] {1,2,3}, 5);
        //System.out.print(Arrays.toString(result));
        assertEquals(Arrays.toString(result), "[1, 2]");
    }
}