package leetcode.backtracking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    // dfs to traversal all possible combinations
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res, n, n, "");
        return res;
    }
    
    private void helper(List<String> res, int open, int close, String s) {
        if (close < open) // open should always <= close
            return;
        
        if (open == 0 && close == 0) {
            res.add(s);
            return;
        }
        
        if (close > 0)
            helper(res, open, close - 1, s + ")");
        if (open > 0) 
            helper(res, open - 1, close, s + "(");
    }

    // backtracking with stack
    Stack<String> stack = new Stack<>();
    int size;
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis_2r(int n) {
        size = n;
        helper(0, 0);
        return res;
    }
    
    private void helper(int open, int close) {
        if(open == size && close == size) {
            String s = "";
            Iterator<String> iterator = stack.iterator();
            while (iterator.hasNext()) {
                s += iterator.next();
            }
            res.add(s);
        }
        
        if (open < size) {
            stack.push("(");
            helper(open + 1, close);
            stack.pop();
        }
        
        if (close < open) {
            stack.push(")");
            helper(open, close + 1);
            stack.pop();
        }
    }
}
