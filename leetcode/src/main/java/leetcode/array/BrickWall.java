package leetcode.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxCount = 0;
        for(List<Integer> row : wall) {
            int index = 0;
            // using row.size() - 1 as boundary because not consider last brick
            for(int i = 0 ; i < row.size() - 1; i++) {
                index += row.get(i);
                map.put(index, map.getOrDefault(index, 0) + 1);
                maxCount = Math.max(maxCount, map.get(index));
            }
        }
        return wall.size() - maxCount;
    }    
}
