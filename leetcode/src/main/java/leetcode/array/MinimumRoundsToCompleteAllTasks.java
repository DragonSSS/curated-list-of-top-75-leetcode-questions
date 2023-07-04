package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundsToCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        int res = 0;
        for(int task : map.keySet()) {
            int count = map.get(task);

            if (count == 1) {
                return -1;
            }

            // 2 -> res += 0
            // 3k -> res += k
            res += count / 3;

            if (count % 3 > 0) {
                // 3k + 1 = 3(k - 1) + 4 ->  res + 1
                // 3k + 2 -> res += 1
                res += 1;
            }
        }
        return res;
    }    
}
