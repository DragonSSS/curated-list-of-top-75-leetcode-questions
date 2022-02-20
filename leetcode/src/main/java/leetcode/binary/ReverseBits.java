package leetcode.binary;

public class ReverseBits {
    public int reverseBits(int n) {
        int res = 0;
        if (n == 0)
            return res;

        for(int i = 0; i < 32; i++) {
            res <<= 1;
            if ((n & 1) == 1)
                res += 1;
            n >>= 1;
        }

        return res;
    }

    public int reverseBits_2r(int n) {
        int res = 0;
        if (n == 0)
            return n;
        
        
        for(int i = 0; i < 32; i++) {
            res = res << 1;
            if ((n & 1) == 1) {
                res+=1;
            }
            n = n >> 1;
        }
        
        return res;
    }
}
