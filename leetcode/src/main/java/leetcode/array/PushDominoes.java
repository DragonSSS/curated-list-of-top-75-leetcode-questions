package leetcode.array;

public class PushDominoes {
    public String pushDominoes(String dominoes) {
        if (dominoes.length() == 1)
            return dominoes;
        
        StringBuilder sb = new StringBuilder(dominoes);
        char[] chars = dominoes.toCharArray();
        int n = chars.length;

        // ->
        boolean[] backward = new boolean[n];
        // <-
        boolean[] forward = new boolean[n];
        
        char pre = '.';
        for(int i = 0; i < n; i++) {
            if(chars[i] == '.') {
                if(pre == 'R')
                    backward[i] = true;
            } else {
               pre = chars[i]; 
            }
        }
        
        pre = '.';
        for(int i = n - 1; i >= 0; i--) {
            if(chars[i] == '.') {
                if(pre == 'L')
                   forward[i] = true; 
            } else {
                pre = chars[i];
            }
        }
        
        int i = 0;
        while(i < n) {
            if(!backward[i] && forward[i]) {
                sb.setCharAt(i++, 'L');
            } else if(backward[i] && !forward[i]) {
                sb.setCharAt(i++, 'R');
            } else if(backward[i] && forward[i]) {
                int j = i + 1;
                while(j < n && backward[j] && forward[j]){
                    j++;
                }
                helper(sb, i, j - 1);
                i = j;
            } else {
                i++;
            }
        }
        
        return sb.toString();
    }
    
    private void helper(StringBuilder sb, int left, int right) {
        while(left < right) {
            sb.setCharAt(left++, 'R');
            sb.setCharAt(right--, 'L');
        }
    }    
}
