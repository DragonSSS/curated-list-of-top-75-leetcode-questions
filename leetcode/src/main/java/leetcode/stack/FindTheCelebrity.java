package leetcode.stack;

import java.util.Stack;

public class FindTheCelebrity {

    // mock api
    boolean knows (int a, int b) {
        return false;
    }

    public int findCelebrity(int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        int a = 0, b = 0;
        while(stack.size() > 1) {
            a = stack.pop(); 
            b = stack.pop();

            if (knows(a, b)) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }

        int ans = stack.pop();

        for (int i = 0; i < n; i++) {
            if (i == ans) {
                continue;
            }

            if (knows(ans, i) || !knows(i, ans)) {
                return -1;
            }
        }
        return ans;
    }
}
