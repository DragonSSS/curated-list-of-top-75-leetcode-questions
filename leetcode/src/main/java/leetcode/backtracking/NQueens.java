package leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        boolean[] col = new boolean[n];
        boolean[] diagonal1 = new boolean[2*n - 1];
        boolean[] diagonal2 = new boolean[2*n - 1];
        helper(new ArrayList<>(), col, diagonal1, diagonal2, n, 0);
        return res;
    }
    
    private void helper(List<String> list, boolean[] col, boolean[] diagonal1, boolean[] diagonal2, int n, int rowIndex) {
        if (rowIndex == n) {
            res.add(new ArrayList<>(list));
        }
        
        //iterate col from 0 to n - 1
        for (int i = 0; i < n; i++) {
            if (col[i] || diagonal1[rowIndex + i] || diagonal2[rowIndex - i + n - 1]) continue;
            char[] chars = new char[n];
            Arrays.fill(chars, '.');
            chars[i] = 'Q';
            col[i] = true;
            diagonal1[rowIndex + i] = true;
            diagonal2[rowIndex - i + n - 1] = true;
            list.add(new String(chars));
            
            helper(list, col, diagonal1, diagonal2, n, rowIndex + 1);
            
            // backtracking
            list.remove(list.size() - 1);
            chars[i] = '.';
            col[i] = false;
            diagonal1[rowIndex + i] = false;
            diagonal2[rowIndex - i + n - 1] = false;
        }
    }
}
