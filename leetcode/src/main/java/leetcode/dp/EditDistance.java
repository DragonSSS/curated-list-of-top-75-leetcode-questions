package leetcode.dp;

public class EditDistance {
    // dfs + memorization
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        Integer[][] memo = new Integer[n + 1][m + 1];
        
        return helper(word1, word2, n, m, memo);
    }
    
    private int helper(String word1, String word2, int len1, int len2, Integer[][] memo){
        if (len1 == 0)
            return len2;
        
        if (len2 == 0)
            return len1;
        
        if (memo[len1][len2] != null) {
            return memo[len1][len2];
        }
        
        if (word1.charAt(len1 - 1) == word2.charAt(len2 - 1)) {
            return helper(word1, word2, len1 - 1, len2 - 1, memo);
        }
        
        
        // word1 insert or word2 delete
        int deleteOrInsert1 =  helper(word1, word2, len1, len2 - 1, memo) + 1;
        // word2 insert or word1 delete
        int deleteOrInsert2 =  helper(word1, word2, len1 - 1, len2, memo) + 1;
        // replace
        int replace = helper(word1, word2, len1 - 1, len2 - 1, memo) + 1;
        
        memo[len1][len2] = Math.min(replace, Math.min(deleteOrInsert1, deleteOrInsert2));
        
        return  memo[len1][len2];
    }

    // recursion with memorization
    Integer[][] memo;
    public int minDistance_2r(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        memo = new Integer[m + 1][n + 1];
        return helper_2r(word1, word2, m, n);
    }
    
    private int helper_2r(String word1, String word2, int len1, int len2) {
        if (len1 == 0)
            return len2;
        
        if (len2 == 0)
            return len1;
        
        if (memo[len1][len2] != null)
            return memo[len1][len2];
        
        // two chars match, no operation required
        if (word1.charAt(len1 - 1) == word2.charAt(len2 - 1))
            return helper_2r(word1, word2, len1 - 1, len2 - 1);
        
        // insert char into word1
        //   abore
        // bcd(o)re
        int insert = helper_2r(word1, word2, len1, len2 - 1) + 1;
        // delete char from word1
        int delete = helper_2r(word1, word2, len1 - 1, len2) + 1;
        // replace char
        int replace = helper_2r(word1, word2, len1 - 1, len2 - 1) + 1;
        
        int miniCost = Math.min(insert, Math.min(delete, replace));
        memo[len1][len2] = miniCost;
        return miniCost;
    }
}
