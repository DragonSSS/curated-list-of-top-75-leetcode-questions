package leetcode.stack;

import java.util.List;
import java.util.Stack;

public class ExclusiveTimeOfFunctions {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        // store id of function
        Stack<Integer> stack = new Stack<>();
        int preTimestamp = 0;
        for(String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String status = parts[1];
            int curTimestamp = Integer.parseInt(parts[2]);
            
            if("start".equals(status)) {
                if (!stack.isEmpty()) {
                    res[stack.peek()] += curTimestamp - preTimestamp;
                }
                preTimestamp = curTimestamp;
                stack.push(id);
            // status is end, the calling func is complete    
            } else {
                // inclusive preTimestamp
                res[stack.pop()] += curTimestamp - preTimestamp + 1;
                // next preTimestamp should be another func by adding one
                preTimestamp = curTimestamp + 1;
            }
        }
        return res;
    }    
}
