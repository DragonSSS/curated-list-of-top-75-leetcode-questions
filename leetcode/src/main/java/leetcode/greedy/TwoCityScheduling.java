package leetcode.greedy;

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
}
