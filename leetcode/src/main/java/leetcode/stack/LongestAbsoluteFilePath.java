package leetcode.stack;

import java.util.Stack;

public class LongestAbsoluteFilePath {
    // dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext
    // split by \n
    // dir
    // \tsubdir1
    // \tsubdir2
    // \t\tfile.ext

    // level 0, len 3 + 1, curLen = 0 + 4 = 4
    // stack 4
    // level 1, len 7 + 1, curLen = 4 + 8 = 12
    // stack 12
    // level 1
    public int lengthLongestPath(String input) {
        String[] parts = input.split("\n");
        int curLen = 0;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for(String s : parts) {
            int depth = getDepth(s);

            while(stack.size() > depth) {
                curLen -= stack.pop();
            }

            int len = s.replaceAll("\t", "").length() + 1;
            curLen += len;
            if (s.contains(".")) {
                res = curLen - 1 > res ? curLen - 1 : res;
            }
            stack.push(len);
        }
        return res;
    }

    private int getDepth(String str) {
        String cur = str.replaceAll("\t", "");
        return str.length() - cur.length();
    }    
}
