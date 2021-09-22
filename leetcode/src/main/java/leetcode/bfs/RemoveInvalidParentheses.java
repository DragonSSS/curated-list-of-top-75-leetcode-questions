package leetcode.bfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses_dfs(String s) {
        List<String> res = new ArrayList<>();
        helper(s, new char[]{'(', ')'}, 0, 0, res);
        return res;
    }

    private void helper(String s, char[] pattern, int start, int lastRemove, List<String> res) {
        int count = 0;

        for(int i = start; i < s.length(); i++) {
            if(s.charAt(i) == pattern[0])
                count++;
            if(s.charAt(i) == pattern[1])
                count--;

            if(count < 0) {
                // delete ')' or '('
                for(int j = lastRemove; j <= i; j++) {
                    char c = s.charAt(j);
                    if(c == pattern[1] && (j == lastRemove || c != s.charAt( j - 1) )) {
                        // prefix s.substring(0, j) is valid
                        String rest = s.substring(0, j) + s.substring(j + 1);
                        helper(rest, pattern, i, j, res);
                    }
                }
                // important after try to remove invalid parentheses at diff positions, return
                // otherwise the invalid string will be in res
                return;
            }
        }

        String reverse = new StringBuilder(s).reverse().toString();
        if(pattern[0] == '(') {
            helper(reverse, new char[]{ ')', '('}, 0, 0, res);
        } else {
            res.add(reverse);
        }
    }

    public List<String> removeInvalidParentheses_bfs(String s) {
        List<String> res = new ArrayList<>();
        if(s == null)
            return res;
        Queue<String> queue = new LinkedList<>();
        // avoid duplicates
        Set<String> visited = new HashSet<>();
        queue.offer(s);
        visited.add(s);

        boolean foundValid = false;
        while (!queue.isEmpty()) {
            s = queue.poll();
            if(isValid(s)) {
                res.add(s);
                foundValid = true;
            }

            // we don't do any further bfs using items pending in the queue since any further bfs would only yield strings of smaller length.
            // However the items already in queue need to be processed since there could be other solutions of the same length.
            if (foundValid) continue;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != '(' && s.charAt(i) != ')') continue;
                String rest = s.substring(0, i) + s.substring(i + 1);
                if(!visited.contains(rest)) {
                    queue.offer(rest);
                    visited.add(rest);
                }
            }
        }

        return res;
    }

    private boolean isValid(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') count++;
            if(s.charAt(i) == ')') count--;
            if (count < 0)
                return false;
        }
        return count == 0;
    }
}
