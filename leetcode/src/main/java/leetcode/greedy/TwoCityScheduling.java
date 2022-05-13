package leetcode.greedy;

import java.util.Arrays;

public class TwoCityScheduling {
    // dfs
    Integer[][] memo;
    int max = 100000; //100 * 1000
    public int twoCitySchedCost(int[][] costs) {
        int pplPerCity = costs.length / 2;
        memo = new Integer[pplPerCity + 1][pplPerCity + 1];
        return helper(0, 0, 0, costs, pplPerCity);
    }
    
    private int helper(int index, int cityA, int cityB, int[][] costs, int pplPerCity) {
        if(cityA == pplPerCity && cityB == pplPerCity)
            return 0;
        
        if (cityA > pplPerCity || cityB > pplPerCity)
            return max;
        
        if (memo[cityA][cityB] != null)
            return memo[cityA][cityB];
        
        int toCityA = costs[index][0] + helper(index + 1, cityA + 1, cityB, costs, pplPerCity);
        int toCityB = costs[index][1] + helper(index + 1, cityA, cityB + 1, costs, pplPerCity);
        
        int res = Math.min(toCityA, toCityB);
        memo[cityA][cityB] = res;
        return res;
    }

    // greedy
    // diff (cost of going to B instead of A)
    // [10, 20] -> 10
    // [30, 200] -> 170
    // [400, 50] -> -350
    // [30, 20] -> -10
    public int twoCitySchedCost_2r(int[][] costs) {
        int[][] diff = new int[costs.length][3];
        
        for(int i = 0; i < costs.length; i++) {
            diff[i] = new int[]{costs[i][1] - costs[i][0], costs[i][0], costs[i][1]};
        }

        Arrays.sort(diff, (a, b) -> b[0] - a[0]);
        
        int ppl = costs.length;
        int half = ppl / 2;
        int res = 0;
        
        for(int i = 0; i < diff.length; i++) {
            if (i < half) {
                res += diff[i][1];
            } else {
                res += diff[i][2];
            }
        }
        return res;
    }    
}
