package leetcode.string;

public class ValidPalindromeII {
    //abaa
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i <= j) {
            if (chars[i] != chars[j]) {
                return (isPalindrome(chars, i + 1, j) || isPalindrome(chars, i, j - 1));

            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isPalindrome(char[] chars, int i, int j) {
        while(i <= j) {
            if (chars[i++] != chars[j--]) {
                return false;
            }
        }
        return true;
    }
}
