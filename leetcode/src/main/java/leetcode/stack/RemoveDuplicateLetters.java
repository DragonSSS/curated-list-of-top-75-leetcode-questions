package leetcode.stack;

import java.util.Stack;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for(int i = 0 ; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            lastIndex[index] = i;
        }

        boolean[] visited = new boolean[26];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (visited[index]) {
                continue;
            }

            while(!stack.isEmpty() && lastIndex[stack.peek()] > i && stack.peek() > index) {
                visited[stack.pop()] = false;
            }

            stack.push(index);
            visited[index] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.insert(0, (char)(stack.pop() + 'a'));
        }
        return sb.toString();
    }    
}
