package leetcode.dp;

public class ClimbingStairs {
    // 1 <= n <= 45
    // step 1 or 2 to n
    // n = 0, count = 0;
    // n = 1, count = 1;
    // n = 2, count = 2;
    // top-down
    private int[] memo = new int[46];
    public int climbStairs(int n) {
        int res = 0;

        if (n == 0)
            res = 0;

        if (n == 1)
            res = 1;

        if (n == 2)
            res = 2;

        if (n > 2 && memo[n] == 0)
            res = climbStairs(n - 1) + climbStairs(n - 2);

        if (n > 2 && memo[n] != 0)
            res = memo[n];

        memo[n] = res;
        return res;
    }
}
