package leetcode.greedy;

public class MinimumHealthToBeatGame {
    public long minimumHealth(int[] damage, int armor) {
        if (damage.length == 0)
            return 1;
        
        long health = 1;
        int maxDamage = 0;
        
        for(int d : damage) {
            health += d;
            maxDamage = Math.max(maxDamage, d);
        }
        
        health -= Math.min(armor, maxDamage);
        
        return health;
    }    
}
