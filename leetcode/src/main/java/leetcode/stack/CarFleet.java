package leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    // data structure, position, time
    // sort based on position from far to close
    // monotonic stack to track fleet
    class CarData {
        int position;
        double time;
        
        public CarData(int position, double time) {
            this.position = position; //could use distance
            this.time = time;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        CarData[] carData = new CarData[position.length];
        for(int i = 0; i < position.length; i++) {
            int pos = position[i];
            int distance = target - pos;
            double time = distance * 1.0 / speed[i];
            carData[i] = new CarData(pos, time);
        }
        
        Arrays.sort(carData, (a, b) -> a.position - b.position); // O(nlogn)
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < carData.length; i++) {
            while(!stack.isEmpty() && stack.peek() <= carData[i].time) {
                stack.pop();
            }
            stack.push(carData[i].time);
        }
        return stack.size();
    }
}
