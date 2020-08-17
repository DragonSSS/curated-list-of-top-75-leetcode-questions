package hackerrank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class TestMergeTwoSortedArrays {

    @Test
    public void testMergeTwoArrays() {
        MergeTwoSortedArrays mtsa = new MergeTwoSortedArrays();

        List<Integer> list1 = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(5);
            add(7);
        }};

        List<Integer> list2 = new ArrayList<Integer>(){{
            add(2);
            add(4);
            add(6);
            add(8);
        }};

        String result = mtsa.mergeTwoArrays(list1, list2).stream().map(String::valueOf).collect(Collectors.joining());
        assertEquals("122345678", result);
    }
}
