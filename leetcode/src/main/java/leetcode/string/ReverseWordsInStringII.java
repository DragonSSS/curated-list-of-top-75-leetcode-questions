package leetcode.string;

public class ReverseWordsInStringII {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);
        reverseByWord(s);
    }

    private void reverse(char[] word, int start, int end) {
        while(start < end) {
            char temp = word[start];
            word[start] =  word[end];
            word[end] = temp;
            start++;
            end--;
        }
    }

    private void reverseByWord(char[] s) {
        int left = 0, right = 0;
        int size = s.length;
        while(left < size) {
            while(right  < size && s[right] != ' ') {
                right++;
            }
            reverse(s, left, right - 1);
            left = right + 1;
            right++;
        }
    }    
}
