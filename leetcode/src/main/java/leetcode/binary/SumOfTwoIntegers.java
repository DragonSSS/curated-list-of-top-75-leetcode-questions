package leetcode.binary;

public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while(b != 0) {
            int carry = a & b; // identical components
            a = a ^ b; // complementary components
            b = carry << 1;
        }
        return a;
    }

    public int getSum_2r(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
