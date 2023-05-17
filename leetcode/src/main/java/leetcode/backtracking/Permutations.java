package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums, new ArrayList<>());
        return res;
    }
    
    private void helper(int[] nums, List<Integer> curArray) {
        if(curArray.size() == nums.length) {
            res.add(new ArrayList<>(curArray));
        }
        
        for(int num : nums) {
            if (curArray.contains(num))
                continue;
            
            curArray.add(num);
            helper(nums, curArray);
            curArray.remove(curArray.size() - 1);
        }
    }

    // List<List<Integer>> res;
    public List<List<Integer>> permute_2r(int[] nums) {
        res = new ArrayList<>();
        helper_2r(nums, new ArrayList<>());
        return res;
    }

    private void helper_2r(int[] nums, List<Integer> curList) {
        if(curList.size() == nums.length) {
            res.add(new ArrayList<>(curList));
            return;
        }

        for(int num : nums) {
           if(curList.contains(num)) {
               continue;
           }
           curList.add(num);
           helper_2r(nums, curList);
           curList.remove(curList.size() - 1);
        }
    }
}
