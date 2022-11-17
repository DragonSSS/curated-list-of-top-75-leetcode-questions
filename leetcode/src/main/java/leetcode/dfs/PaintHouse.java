package leetcode.dfs;

public class PaintHouse {
    // [17,2,17]
    // [16,16,5]
    // [14,3,19]
    Integer[][] memo;
    int size = 0;
    public int minCost(int[][] costs) {
        size = costs.length;
        memo = new Integer[size][3];
        return Math.min(Math.min(helper(0, 0, costs), helper(0, 1, costs)), helper(0, 2, costs));
    }
    
    private int helper(int index, int color, int[][] costs) {
        if (index == size)
            return 0;
        
        if (memo[index][color] != null)
            return memo[index][color];
        
        int cost = costs[index][color];
        if (color == 0) {
            cost += Math.min(helper(index + 1, 1, costs), helper(index + 1, 2, costs));
        } else if (color == 1) {
            cost += Math.min(helper(index + 1, 0, costs), helper(index + 1, 2, costs));
        } else {
            cost += Math.min(helper(index + 1, 0, costs), helper(index + 1, 1, costs));
        }
        
        memo[index][color] = cost;
        return cost;
    }    
}
