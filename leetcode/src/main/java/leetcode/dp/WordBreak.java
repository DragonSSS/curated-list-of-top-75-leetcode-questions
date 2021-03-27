package leetcode.dp;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] visited = new boolean[s.length() + 1];
        return helper(s, 0, wordDict, visited);
    }

    private boolean helper(String s, int index, List<String> wordDict, boolean[] visited) {
        if (index == s.length())
            return true;

        visited[index] = true;

        // note:  i < s.length() + 1 to get all of chars as substring()
        for(int i = index + 1; i < s.length() + 1; i++) {
            String subStr = s.substring(index, i);
            if (!visited[i] && wordDict.contains(subStr) && helper(s, i, wordDict, visited))
                return true;
        }

        return false;
    }
}
