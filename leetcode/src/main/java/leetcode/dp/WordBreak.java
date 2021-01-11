package leetcode.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return helper(0, s, new HashSet<>(wordDict), new boolean[s.length() + 1]);
    }

    private boolean helper(int index, String s, Set<String> dict, boolean[] visited) {
        if (index == s.length())
            return true;

        visited[index] = true;

        for(int i = index + 1; i < s.length() + 1; i++) {
            String cur = s.substring(index, i);
            if(!visited[i] && dict.contains(cur) && helper(i, s, dict, visited))
                return true;
        }

        return false;
    }
}
