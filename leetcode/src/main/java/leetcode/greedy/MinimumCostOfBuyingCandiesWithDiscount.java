package leetcode.greedy;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        int res = 0;
        Arrays.sort(cost);
        for (int i = cost.length - 1, j = 1; i >=0; i--, j++) {
            if  (j % 3 != 0) {
                res += cost[i];
            }
        }
        return res;
    }    
}
