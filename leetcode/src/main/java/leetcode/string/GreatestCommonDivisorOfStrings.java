package leetcode.string;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        for (int i = Math.min(len1, len2); i >= 1 ; i--) {
            if(helper(i, len1, str1, len2, str2)) {
                return str1.substring(0, i);
            }
        }

        return "";
    }

    private boolean helper(int len, int len1, String str1, int len2, String str2) {
        if ((len1 % len != 0) || (len2 % len != 0)) {
            return false;
        }

        int repeat1 = len1 / len;
        int repeat2 = len2 / len;

        String res1 = "", res2 = "";
        for (int i = 0; i < repeat1; i++) {
            res1 += str1.substring(0, len);
        }

        for (int i = 0; i < repeat2; i++) {
            res2 += str1.substring(0, len);
        }
        return res1.equals(str1) && res2.equals(str2);
    }    
}
