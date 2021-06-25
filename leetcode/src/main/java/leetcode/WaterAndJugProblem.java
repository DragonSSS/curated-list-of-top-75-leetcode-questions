package leetcode;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class WaterAndJugProblem {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        int[] operations = new int[]{jug1Capacity, -jug1Capacity, jug2Capacity, -jug2Capacity};
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        while(!queue.isEmpty()) {
            int n = queue.size();
            for(int i = 0; i < n; i++) {
                int cur = queue.poll();
                if(cur == targetCapacity)
                    return true;
                for(int op : operations) {
                    int next = cur + op;
                    if(next < 0 || next > jug1Capacity + jug2Capacity || visited.contains(next))
                        continue;
                    queue.offer(next);
                    visited.add(next);
                }
            }
        }

        return false;
    }
}