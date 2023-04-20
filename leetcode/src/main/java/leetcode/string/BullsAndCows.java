package leetcode.string;

public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int[] map = new int[10];

        StringBuilder sb = new StringBuilder();
        int bulls = 0, cows = 0;
        for(int i = 0; i < secret.length(); i++) {
            int secretVal = secret.charAt(i) - '0';
            int guessVal = guess.charAt(i) - '0';
            if (secretVal == guessVal) {
                bulls++;
            } else {
                if (map[secretVal] < 0) cows++;
                if (map[guessVal] > 0) cows++;

                map[secretVal]++;
                map[guessVal]--;
            }
        }

        sb.append(String.valueOf(bulls));
        sb.append('A');
        sb.append(String.valueOf(cows));
        sb.append('B');
        return sb.toString();
    }    
}
