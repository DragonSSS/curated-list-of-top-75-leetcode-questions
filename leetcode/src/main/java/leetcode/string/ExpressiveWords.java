package leetcode.string;

public class ExpressiveWords {
    public int expressiveWords(String s, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isStretchy(s, word)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isStretchy(String s, String word) {
        int i = 0, j = 0;
        
        while(i < s.length() && j < word.length()) {
            if(s.charAt(i) != word.charAt(j))
                return false;
            
            int sBlockSize = 1;
            i++;
            
            while(i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                sBlockSize++;
                i++;
            }
            
            int wBlockSize = 1;
            j++;
            
            while(j < word.length() && word.charAt(j) == word.charAt(j - 1)) {
                wBlockSize++;
                j++;
            }
            
            if (sBlockSize < wBlockSize || (sBlockSize > wBlockSize && sBlockSize < 3))
                return false;
        }
        // abcd - abc
        return i == s.length() && j == word.length();
    }    
}
