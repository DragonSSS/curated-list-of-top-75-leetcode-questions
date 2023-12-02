package leetcode.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RobotCollisions {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] index = new Integer[n];
        for(int i = 0; i < n; i++) {
            index[i] = i;
        }
        Arrays.sort(index, (a, b) -> positions[a] - positions[b]);

        Stack<Integer> stack = new Stack<>();
        for(int i : index) {
            if (directions.charAt(i) == 'R') {
                stack.push(i);
                continue;
            }

            while(!stack.isEmpty() && healths[i] > 0) {
                if (healths[stack.peek()] > healths[i]) {
                    healths[stack.peek()] -= 1;
                    healths[i] = 0;
                } else if (healths[stack.peek()] < healths[i]) {
                    healths[stack.pop()] = 0;
                    healths[i] -= 1;
                } else {
                    healths[stack.pop()] = 0;
                    healths[i] = 0;
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int val : healths) {
            if (val > 0) {
                res.add(val);
            }
        }
        return res;
    }    
}
