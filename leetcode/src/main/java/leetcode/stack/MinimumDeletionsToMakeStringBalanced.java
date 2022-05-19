package leetcode.stack;

import java.util.Stack;

public class MinimumDeletionsToMakeStringBalanced {
    public int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for(char c : s.toCharArray()) {
            if(c == 'b') {
                stack.push(c);
            } else {
                if(!stack.isEmpty() && stack.peek() == 'b') {
                    stack.pop();
                    res++;
                }
            }
        }
        return res;
    }

    public int minimumDeletions_no_stack(String s) {
        int[] aOnRight = new int[s.length() + 1];
        
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            aOnRight[i] =  aOnRight[i + 1];
            if (c == 'a') {
                aOnRight[i]++;
            }
        }
        
        int res = aOnRight[0];
        int bOnLeft = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'b')
                bOnLeft++;
            res = Math.min(res, bOnLeft + aOnRight[i + 1]);
        }
        
        return res;
    }
}
