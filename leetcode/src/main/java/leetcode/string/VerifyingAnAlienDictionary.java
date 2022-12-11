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
}
