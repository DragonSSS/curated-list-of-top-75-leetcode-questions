package leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;

        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

    public boolean containsDuplicate_2r(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for(int num : nums) {
            if(visited.contains(num)) {
                return true;
            }
            visited.add(num);
        }
        return false;
    }
}
