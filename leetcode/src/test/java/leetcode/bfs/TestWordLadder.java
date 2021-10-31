package leetcode.bfs;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class TestWordLadder {
    @Test
    public void testWordLadder() {
        WordLadder wl = new WordLadder();
        List<String> wordsList1 = new ArrayList<String>() {{
            //["hot","dot","dog","lot","log","cog"]
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
            add("cog");
        }};

        int testResult1 = wl.ladderLength("hit", "cog", wordsList1);

        assertEquals(5, testResult1);

        List<String> wordsList2 = new ArrayList<String>() {{
            //["hot","dot","dog","lot","log"]
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
        }};

        int testResult2 = wl.ladderLength("hit", "cog", wordsList2);
        assertEquals(0, testResult2);
    }
}
