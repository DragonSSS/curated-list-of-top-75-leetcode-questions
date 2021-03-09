package leetcode.dp;

public class MinimumCostForTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int[] memo = new int[days.length];
        return helper(days, costs, 0, memo);
    }

    // top-down
    private int helper(int[] days, int[] costs, int index, int[] memo) {
        if (index >= days.length)
            return 0;

        if (memo[index] != 0)
            return memo[index];

        int oneDayPassMin = helper(days, costs, index + 1, memo) + costs[0];

        int i;

        for (i = index; i < days.length; i++) {
            if (days[i] >= days[index] + 7)
                break;
        }

        int sevenDayPassMin = helper(days, costs, i, memo) + costs[1];

        for (i = index; i < days.length; i++) {
            if (days[i] >= days[index] + 30)
                break;
        }

        int thirtyDayPassMin = helper(days, costs, i, memo) + costs[2];

        int res = Math.min(oneDayPassMin, Math.min(sevenDayPassMin, thirtyDayPassMin));
        memo[index] = res;
        return res;
    }
}
