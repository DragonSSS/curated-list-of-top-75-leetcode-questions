package leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetectSquares {
    Map<String, Integer> map;
    List<int[]> allPoints;
    public DetectSquares() {
        map = new HashMap<>();
        allPoints = new ArrayList<>();
    }
    
    public void add(int[] point) {
        int x = point[0];
        int y = point[1];
        String key = generateKey(x, y);
        map.put(key, map.getOrDefault(key, 0) + 1);
        allPoints.add(point);
    }
    
    public int count(int[] point) {
        int res = 0;
        int x = point[0];
        int y = point[1];
        for(int[] existingPoint : allPoints) {
            int i = existingPoint[0];
            int j = existingPoint[1];
            
            if ((Math.abs(x - i) != Math.abs(y - j)) || x == i || y == j)
                continue;
            
            res += map.getOrDefault(generateKey(x, j), 0) * map.getOrDefault(generateKey(i, y), 0);
        }
        return res;
    }
    
    private String generateKey(int x, int y) {
        return x + ":" + y;
    }    
}
