package leetcode.greedy;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stations = new int[1001];

        // the relative change in amount of ppl per station
        for(int[] trip : trips) {
            stations[trip[1]] += trip[0];
            stations[trip[2]] -= trip[0];
        }

        for(int value : stations) {
            capacity -= value;
            if (capacity < 0)
                return false;
        }

        return true;
    }
}
