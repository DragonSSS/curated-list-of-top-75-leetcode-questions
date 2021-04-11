package leetcode.array;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class TestTwoSum {

    @Test
    public void testTwoSum() {
        TwoSum testInstance = new TwoSum();
        int[] result = testInstance.twoSum( new int[] {1,2,3}, 5);
        assertEquals("[1, 2]", Arrays.toString(result));
    }
}