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

    public String pushDominoes_2r(String dominoes) {
        char[] chars = dominoes.toCharArray();
        int n = chars.length;
        int[] force = new int[n];
        
        int curForce = 0;
        for(int i = 0 ; i < n; i++) {
            if(chars[i] == 'R') {
                curForce = n;
            } else if (chars[i] == 'L')  {
                curForce = 0;
            } else {
                curForce = Math.max(curForce - 1, 0);
            }
            force[i] += curForce;
        }
        
        curForce = 0;
        for (int i = n - 1; i >= 0; i--) {
            if(chars[i] == 'R') {
                curForce = 0;
            } else if (chars[i] == 'L')  {
                curForce = n;
            } else {
                curForce = Math.max(curForce - 1, 0);
            }
            force[i] -= curForce;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int f : force) {
            char c;
            if (f > 0) {
                c = 'R';
            } else if (f < 0) {
                c = 'L';
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public String pushDominoes_3r(String dominoes) {
        char[] chars = dominoes.toCharArray();
        int n = chars.length;
        int[] force = new int[n];
        int curForce = 0;
        for (int i = 0; i < n; i++) {
            char cur = chars[i];
            if (cur == 'R') {
                curForce = n;
            } else if (cur == 'L') {
                curForce = 0;
            } else {
                curForce = Math.max(curForce - 1, 0);
            }
            force[i] += curForce;
        }
        
        curForce = 0;
        for (int i = n - 1; i >= 0; i--) {
            char cur = chars[i];
            if (cur == 'L') {
                curForce = n;
            } else if (cur == 'R') {
                curForce = 0;
            } else {
                curForce = Math.max(curForce - 1, 0);
            }
            force[i] -= curForce;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(force[i] > 0) {
                sb.append('R');
            } else if (force[i] < 0) {
                sb.append('L');
            } else {
                sb.append('.');
            }
        }
        return sb.toString();
    }
}
