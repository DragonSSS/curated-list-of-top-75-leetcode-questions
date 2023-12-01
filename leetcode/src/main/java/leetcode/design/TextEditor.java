package leetcode.design;

import java.util.Stack;

public class TextEditor {
    Stack<Character> left;
    Stack<Character> right;

    public TextEditor() {
        left = new Stack<>();
        right = new Stack<>();
    }
    
    public void addText(String text) {
        for(char c : text.toCharArray()) {
            left.push(c);
        } 
    }
    
    public int deleteText(int k) {
        int count = 0;
        while(!left.isEmpty() && k-- > 0) {
            left.pop();
            count++;
        }
        return count;
    }
    
    public String cursorLeft(int k) {
        while(!left.isEmpty() && k-- > 0) {
            right.push(left.pop());
        }
        return getLeftString();
    }
    
    public String cursorRight(int k) {
        while(!right.isEmpty() && k-- > 0) {
            left.push(right.pop());
        }
        return getLeftString();
    }

    private String getLeftString() {
        int count = 10;
        StringBuilder sb = new StringBuilder();
        while(!left.isEmpty() && count-- > 0) {
            sb.append(left.pop());
        }

        for(int i = sb.length() - 1; i >= 0; i--) {
            left.push(sb.charAt(i));
        }
        return sb.reverse().toString();
    }    
}
