package leetcode.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int res = 1;
        for(int i = 0; i < nums.length; i++) {
            int index = i;
            int count = 1;
            while(index < nums.length - 1 && (nums[index] == nums[index + 1] || nums[index] + 1 == nums[index + 1])) {
                if (nums[index] == nums[index + 1]) {
                    index++;
                } else {
                    count++;
                    index++;
                }
            }
            i = index;
            res = Math.max(res, count);
        }

        return res;
    }

    Set<Integer> numsSet = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    public int longestConsecutive_2r_dfs(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        for(int num : nums) {
            numsSet.add(num);
        }
        
        int res = 0;
        for(int num : nums) {
            res = Math.max(res, helper_2r_dfs(num));
        }
        return res;
    }
    
    private int helper_2r_dfs(int num) {
        if(!numsSet.contains(num) || visited.contains(num))
            return 0;
        
        visited.add(num);
        int curLen = helper_2r_dfs(num - 1) + 1 + helper_2r_dfs(num + 1);
        return curLen;
    }

    // O(n)
    Set<Integer> visited_3r = new HashSet<>();
    Set<Integer> numSet_3r = new HashSet<>();
    public int longestConsecutive_3r(int[] nums) {
        for(int num : nums) {
            numSet_3r.add(num);
        }
        
        int res = 0;
        for(int num : nums) {
            res = Math.max(res, helper_3r(num));
        }
        return res;
    }
    
    private int helper_3r(int num) {
        if (visited_3r.contains(num) || !numSet_3r.contains(num))
            return 0;
        
            visited_3r.add(num);
        
        int cur = helper_3r(num - 1) + 1 + helper_3r(num + 1);
        return cur;
    }

    public int longestConsecutive_4r(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums) {
            numsSet.add(num);
        }
        
        int res = 1;
        for(int num : nums) {
            if (!numsSet.contains(num - 1)) {
                int count = 1;
                int cur = num;
                while(numsSet.contains(cur + 1)) {
                    count++;
                    cur++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
