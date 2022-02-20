package leetcode.binary;

public class NumberOfOneBits {
    // lte version
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }

        return res;
    }

    public int hammingWeight_2r(int n) {
        int res = 0;
        int mask = 1;
        for(int i = 0; i < 32; i++) {
            if((mask & n) != 0)
                res++;
            mask = mask << 1;
        }
        
        return res;
    }
}
