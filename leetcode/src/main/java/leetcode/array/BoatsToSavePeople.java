package leetcode.array;

import java.util.Arrays;

public class BoatsToSavePeople {
    // two pointers + greedy
    // sort people based on weight
    // try to put heaviest and lightest in one boat if possible
    // elsewise let heaviest in one boat
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;
        int left = 0, right = people.length - 1;
        while(left <= right){
            res++;
            int totalWeightIfSameBoat = people[left] + people[right];
            if (totalWeightIfSameBoat <= limit) {
                left++;
            }
            right--;
        }
        return res;
    }    
}
