package leetcode.stack;

import java.util.Stack;

public class DecodeString {
    // two stacks
    // 3[a]2[bc]
    // 3 -> stack1<3>
    // [ -> stack2<"">
    // a -> res = "a"
    // ] -> "" + aaa, res = aaa
    // 2 -> stack1<2>
    // [ -> stack2<aaa>, res = ""
    // bc -> res = bc
    // ] -> aaa + bc + bc, res = aaabcbc
    //
    // 3[a2[c]]
    // 3 -> stack1<3>
    // [ -> stack2<"">;
    // a -> res = a;
    // 2 -> stack1<2, 3>
    // [ -> stack2<"a", "">, res = ""
    // c -> res = c
    // ] -> res = a + c + c = acc
    // ] -> res = "" + acc + acc + acc = accaccacc
    public String decodeString(String s) {
        Stack<Integer> digStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String res = "";
        int index = 0;
        while(index < s.length()) {
            char c = s.charAt(index);
            if (Character.isDigit(c)) {
                int value = 0;
                while(index < s.length() && Character.isDigit(s.charAt(index))) {
                    value = value * 10 + (int)(s.charAt(index) - '0');
                    index++;
                }
                digStack.push(value);
            } else if (c == '[') {
                strStack.push(res);
                res= "";
                index++;
            } else if (c == ']') {
                String curStr = strStack.pop();
                StringBuilder sb = new StringBuilder(curStr);
                int curDigit = digStack.pop();

                for(int i = 0; i < curDigit; i++) {
                    sb.append(res);
                }
                res = sb.toString();
                index++;
            } else {
                // char
                res += c;
                index++;
            }
        }
        return res;
    }    
}
