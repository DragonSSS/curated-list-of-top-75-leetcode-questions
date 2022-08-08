package leetcode.dp;

public class CountVowelsPermutation {
    // dp  O(n)
    // a e i o u
    
    //index  tree
    //0     a -> e
    //1     e -> a, i
    //2     i -> a, e, o, u
    //3     o -> i,u
    //4     u -> a
    
    //     col(len)  0    1    2    3
    
    // row   
    //  a            0    1    3    
    //  e            0    1    2
    //  i            0    1    2
    //  o            0    1    1
    //  u            0    1    2
    public int countVowelPermutation(int n) {
        long[][] dp = new long[n + 1][5];
        for(int i = 0; i < 5; i++) {
            dp[0][i] = 0;
        }
        
        for(int i = 0; i < 5; i++) {
            dp[1][i] = 1;
        }
        
        if (n == 0) {
            return 0;
        }
        
        if (n == 1) {
            return 5;
        }
        long mod = 1000000007;
        for(int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]) % mod;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % mod;
            dp[i][2] = (dp[i - 1][1] + dp[i - 1][3]) % mod;
            dp[i][3] = dp[i - 1][2] % mod;
            dp[i][4] = (dp[i - 1][2] + dp[i - 1][3]) % mod;
        }
        long res = 0;
        for(int i = 0; i < 5; i++) {
            res = (res + dp[n][i]) % mod;
        }
        return (int) res;
    }    
}
