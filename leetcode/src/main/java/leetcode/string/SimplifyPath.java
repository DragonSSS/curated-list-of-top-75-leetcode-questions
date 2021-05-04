package leetcode.string;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] dirs = path.split("/");

        for (int i = 0; i < dirs.length; i++) {
            if (!stack.isEmpty() && dirs[i].equals("..")) {
                stack.pop();
            } else if (!dirs[i].equals("") && !dirs[i].equals("..") && !dirs[i].equals(".")) {
                stack.push(dirs[i]);
            }
        }

        String res = "";
        while(!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }

        return res.isEmpty() ? "/" : res;
    }
}
