package leetcode.design;

public class AtmMachine {
    long[] counts;
    long[] banknotes;
    public AtmMachine() {
        counts = new long[5];
        banknotes = new long[]{20, 50, 100, 200, 500};
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i = 0; i < banknotesCount.length; i++) {
            counts[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] res = new int[5];
        for(int i = banknotes.length - 1; i >= 0 && amount != 0; i--) {
            res[i] = (int) Math.min(counts[i], amount / banknotes[i]);
            amount -= res[i] * banknotes[i];
        }

        if (amount != 0) {
            return new int[] {-1};
        }

        for (int i = 0; i < counts.length; i++) {
            counts[i] -= res[i];
        }
        return res;
    }    
}
