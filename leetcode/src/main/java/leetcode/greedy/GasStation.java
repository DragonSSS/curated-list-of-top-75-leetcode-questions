package leetcode.greedy;

public class GasStation {


    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, currentGas = 0, station = 0;

        for(int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            totalGas += gas[i] - cost[i];
            if(currentGas < 0) {
                currentGas = 0;
                station = i + 1;
            }
        }
        return totalGas < 0 || station >= gas.length ? - 1 : station;
    }

    public int canCompleteCircuit_2r(int[] gas, int[] cost) {
        int curGas = 0, totalGas = 0, station = 0;
        
        for(int i = 0; i < gas.length; i++) {
            curGas += gas[i] - cost[i];
            totalGas += gas[i] - cost[i];
            if(curGas < 0) {
                curGas = 0;
                station = i + 1;
            }
        }
        
        return totalGas < 0 || station >= gas.length ? -1 : station;
    }
}
