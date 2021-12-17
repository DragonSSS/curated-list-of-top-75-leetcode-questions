package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        List<String> curList = new ArrayList<>();
        
        helper(s, 0, curList, res);

        return res;
    }

    private void helper(String s, int start, List<String> curList, List<String> res) {
        // exit condition
        if (curList.size() == 4) {
            if (start != s.length()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for(String str : curList) {
                sb.append(str);
                sb.append(".");
            }
            sb.deleteCharAt(sb.length() - 1);
            res.add(sb.toString());
            return;
        }

        for(int i = start; i < s.length() && i <= start + 3; i++) {
            String cur = s.substring(start, i + 1);
            if (isValid(cur)) {
                curList.add(cur);
                helper(s, i + 1, curList, res);
                // backtracking
                curList.remove(curList.size() - 1);
            }
        }
    }

    private boolean isValid(String s) {
        char first = s.charAt(0);
        if (first == '0') {
            return s.equals("0"); // 000 invalid
        }
        int number = Integer.valueOf(s);
        return number >= 0 && number <= 255;
    }
}
