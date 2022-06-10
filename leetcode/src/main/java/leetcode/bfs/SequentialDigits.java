package leetcode.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i < 10; i++) {
            queue.add(i);
        }

        while(queue.size() > 0){
            int cur = queue.poll();
            if(cur >= low && cur <= high) res.add(cur);
            int onesDigit = cur % 10;
            
            if(onesDigit < 9 && cur * 10 + onesDigit + 1 <= high)
                queue.add(cur * 10 + onesDigit + 1);
        }
        return res;
    }    
}
