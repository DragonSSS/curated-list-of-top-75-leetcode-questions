package leetcode.dp;

import java.util.Map;
import java.util.HashMap;

public class MinimumNumberOfDaysToEatOranges {
    Map<Integer, Integer> memo = new HashMap<>();
    public int minDays(int n) {
        if (n <= 1)
            return n;
        
        if (memo.containsKey(n))
            return memo.get(n);
        
        int res = Math.min(n % 2 + minDays(n / 2), n % 3 + minDays(n / 3)) + 1;
        memo.put(n, res);
        return res;
    }    
}
