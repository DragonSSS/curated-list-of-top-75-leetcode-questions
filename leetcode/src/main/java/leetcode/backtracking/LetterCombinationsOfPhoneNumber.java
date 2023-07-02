package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    char[][] mapping = new char[][]{
        { }, // 1 - 1
        {'a', 'b', 'c'},// 2 - 1
        {'d','e','f'}, // 3 - 1
        {'g', 'h', 'i'}, // 4 - 1
        {'j', 'k', 'l'}, // 5 - 1
        {'m', 'n', 'o'}, // 6 - 1
        {'p', 'q', 'r', 's'}, // 7 - 1
        {'t', 'u', 'v'}, // 8 - 1
        {'w', 'x', 'y', 'z'} // 9 - 1
    };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0)
            return res;
        helper(0, digits, res, new StringBuilder());
        return res;
    }
    
    private void helper(int index, String digits, List<String> res, StringBuilder sb) {
        if(index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        
        int cur = digits.charAt(index) - '0';
        for(char c : mapping[cur - 1]) {
            int len = sb.length();
            sb.append(c);
            helper(index + 1, digits, res, sb);
            sb.delete(len, len + 1);
        }
    }

    String[][] letterMapping = new String[][]{
        {""},
        {"a", "b", "c"},
        {"d", "e", "f"},
        {"g", "h", "i"},
        {"j", "k", "l"},
        {"m", "n", "o"},
        {"p", "q", "r", "s"},
        {"t", "u", "v"},
        {"w", "x", "y", "z"}
    };
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations_2r(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        helper_2r(digits, 0, new StringBuilder());
        return res;
    }

    private void helper_2r(String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        for(String s : letterMapping[digit - 1]) {
            sb.append(s);
            helper_2r(digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
