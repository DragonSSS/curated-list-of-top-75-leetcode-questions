package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlienDictionary {
    @Test
    public void testAlienDictionary() {
        String[] data = new String[] {
                "wrt",
                "wrf",
                "er",
                "ett",
                "rftt"
        };

        String res = new AlienDictionary().alienOrder(data);
        assertEquals("wertf", res);
    }
}
