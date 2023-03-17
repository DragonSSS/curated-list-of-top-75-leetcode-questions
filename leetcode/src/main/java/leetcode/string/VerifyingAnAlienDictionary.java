package leetcode.string;

public class VerifyingAnAlienDictionary {
    int[] map;
    public boolean isAlienSorted(String[] words, String order) {
        map = new int[26];
        for(int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            map[c - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!helper(words[i], words[i + 1]))
                return false;
        }
        return true;
    }

    private boolean helper(String word1, String word2) {
        for (int i = 0, j = 0; i < word1.length() && j < word2.length(); i++, j++) {
            if (word1.charAt(i) != word2.charAt(j)) {
                if (map[word1.charAt(i) - 'a'] > map[word2.charAt(j) - 'a']) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        if (word1.length() > word2.length()) {
            return false;
        }
        return true;
    }
    public boolean isAlienSorted_2r(String[] words, String order) {
        int[] map = new int[order.length()];
        for(int i = 0 ; i < order.length(); i++) {
            map[order.charAt(i) - 'a'] = i;
        }
        
        if (words.length == 1)
            return true;
        
        for(int i = 0; i < words.length - 1; i++) {
            if(compare(words[i], words[i + 1], map)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean compare(String s1, String s2, int[] map) {
        for(int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (map[s1.charAt(i) - 'a'] > map[s2.charAt(j) - 'a']) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        
        if (s1.length() > s2.length()) {
            return true;
        }
        
        return false;
    }    
}
