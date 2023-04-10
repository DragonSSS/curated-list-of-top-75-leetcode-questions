package leetcode.string;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        for(char c : s.toCharArray()) {
            map[c]++;
        }

        int res = 0;
        boolean flag = true;
        for(int i = 0; i < 128; i++) {
            if(map[i] % 2 == 0) {
                res += map[i];
            } else {
                res += map[i] - 1;
                if(flag) {
                    res+=1;
                    flag = false;
                }
            }
        }

        return res;
    }

    public int longestPalindrome_2r(String s) {
        int[] map = new int[128];
        for(char c : s.toCharArray()) {
            map[c]++;
        }

        int res = 0;
        boolean flag = false;
        for(int i = 0; i < 128; i++) {
            if(map[i] % 2 == 0) {
                res+= map[i];
            } else {
                if (!flag) {
                    res += map[i];
                    flag = true;
                } else {
                    res += map[i] - 1;
                }
            }
        }
        return res;
    }
}
