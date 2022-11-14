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

    // a know b => knows(a, b);
    // knows(x, celebrity) -> always true;
    // knows(celebrity, x) -> always false;
    // use stack to approach celerity as much as possible
    // stack to store all possible ppl first, then try to poll up two
    // use knows() api to check possible ppl
    public int findCelebrity_2r(int n) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            stack.push(i);
        }
        
        while(stack.size() > 1) {
            int ppl1 = stack.pop();
            int ppl2 = stack.pop();
            if (knows(ppl1, ppl2)) {
                stack.push(ppl2);
            } else { // dont use if (knows(ppl2, ppl1)) that could cause pop() on empty stack below
                stack.push(ppl1);
            }
        }
        
        int res = stack.pop();
        
        for(int i = 0; i < n; i++) {
            if (i == res)
                continue;
            
            if (!knows(i, res) || knows(res, i))
                return -1;
        }
        return res;
    }    
}
