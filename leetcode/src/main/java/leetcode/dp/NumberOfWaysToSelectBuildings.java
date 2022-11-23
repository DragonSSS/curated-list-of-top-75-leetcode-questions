package leetcode.dp;

public class NumberOfWaysToSelectBuildings {
    // 0 -> office
    // 1 -> restaurant
    // try to find how many 0..1..0 and 1..0..1
    // dp
    public long numberOfWays(String s)
    {
        long zero = 0; // count of 0
        long one = 0; // count of 1
        long oneZero = 0; // count of 1..0
        long zeroOne = 0; // count of 0..1
        long res = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zero += 1;
                oneZero += one;
                res += zeroOne;
            } else {
                one += 1;
                zeroOne += zero;
                res += oneZero;
            }
        }
        return res;
    }    
}
