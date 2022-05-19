package leetcode.stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInStringII {
    class CharFreq {
        char c;
        int freq;
        
        public CharFreq(char c) {
            this.c = c;
            this.freq = 1;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<CharFreq> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek().c == c) {
                stack.peek().freq++;
                if (stack.peek().freq == k) {
                    stack.pop();
                }
            } else {
                stack.push(new CharFreq(c));
            }
        }
        
        
        String res = "";
        while(!stack.isEmpty()) {
            CharFreq cur = stack.pop();
            String charStr = String.valueOf(cur.c);
            for(int i = 1; i < cur.freq; i++) {
                charStr += cur.c;
            }
            
            res = charStr + res;
        }
        
        return res;
    }    
}
