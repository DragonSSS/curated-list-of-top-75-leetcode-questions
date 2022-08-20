package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class TwentyFourGame {
    // backtracking
    // 1.0 / 0.0 == Infinity
    public boolean judgePoint24(int[] cards) {
        List<Double> cardList = new ArrayList<>();
        for(int card : cards) {
            cardList.add((double) card);
        }
        
        return helper(cardList);
    }
    
    private boolean helper(List<Double> values) {
        if(values.size() == 1) {
            if (Math.abs(values.get(0) - 24.0) <= 0.001) {
                return true;
            } else {
                return false;
            }
        }
        
        for(int i = 0; i < values.size(); i++) {
            for(int j = i + 1; j < values.size(); j++) {
                List<Double> nextRound = new ArrayList<>();
                for(int k = 0; k < values.size(); k++) {
                    if(k != i && k != j) {
                        nextRound.add(values.get(k));
                    } 
                }
                
                double[] possibleNexts = compute(values.get(i), values.get(j));
                for(double next : possibleNexts) {
                    nextRound.add(next);
                    if (helper(nextRound)) {
                        return true;
                    }
                    nextRound.remove(nextRound.size() - 1);
                }
            }
        }
        
        return false;
    }
    
    private double[] compute(double a, double b) {
        return new double[]{a - b, b - a, a + b, a * b, b == 0.0 ? Double.MAX_VALUE : a / b, a == 0.0 ? Double.MAX_VALUE : b / a };
    }    
}
