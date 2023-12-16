package leetcode.string;

public class LargestPalindromicNumber {
    public String largestPalindromic(String num) {
        int[] map = new int[10];
        for(char c : num.toCharArray()) {
            map[c - '0']++;
        }

        int odd = -1;
        for(int i = 0; i <= 9; i++) {
            if (map[i] % 2 == 1) {
                odd = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j < map[i] / 2; j++) {
                if (i == 0 && sb.length() == 0) {
                    break;
                }
                sb.insert(0, i);
            }
        }

        StringBuilder half = new StringBuilder(sb);
        half.reverse();
        if (odd == -1) {
            if (sb.length() == 0) {
                return "0";
            }
            return half.toString() + sb.toString();
        }
        return half.toString() + odd + sb.toString();
    }    
}
