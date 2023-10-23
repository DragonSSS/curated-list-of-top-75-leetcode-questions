package leetcode.string;

public class DecodedStringAtIndex {
    public String decodeAtIndex(String s, int k) {
        long len = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                len *= c - '0';
            } else {
                len++;
            }
        }

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            k %= len;
            if (k == 0 && Character.isLetter(c)) {
                return String.valueOf(c);
            }

            if (Character.isDigit(c)) {
                len /= c - '0';
            } else {
                len--;
            }
        }
        return "";
    }    
}
