package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        helper(s, new char[]{'(', ')'}, 0, 0, res);
        return res;
    }

    private void helper(String s, char[] pattern, int start, int lastRemove, List<String> res) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == pattern[0])
                count++;
            if(s.charAt(i) == pattern[1])
                count--;

            if(count < 0) {
                // delete ')' or '('
                for(int j = lastRemove; j <= i; j++) {
                    char c = s.charAt(j);
                    if(c == pattern[1] && (j == lastRemove || c != s.charAt( j - 1) )) {
                        String rest = s.substring(0, j) + s.substring(j + 1);
                        helper(rest, pattern, i, j, res);
                    }
                }
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
}
