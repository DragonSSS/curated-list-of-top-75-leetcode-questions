package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    // dfs + backtracking
    // O(n*(2^n))
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), res);
        return res;
    }
    
    private void helper(String s, int index, List<String> curList, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(curList)); // add deep copied arraylist instead of just adding original one
            return;
        }
        
        for(int i = index + 1; i <= s.length(); i++) { // i could be s.length()
            String prefix = s.substring(index, i);
            if (isPalindrome(prefix)) {
                curList.add(prefix);
                helper(s, i, curList, res);
                curList.remove(curList.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
           if (s.charAt(i) != s.charAt(j))
               return false;
            i++;
            j--;
        }
        return true;
    }    
}
