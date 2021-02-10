package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        // edge case
        if (nums == null || nums.length == 0)
            return res;

        Arrays.sort(nums);
        helper(nums, res, new ArrayList<Integer>(), 0);

        return res;
    }

    private void helper(int[] nums, List<List<Integer>> res, List<Integer> subset, int index) {
        res.add(new ArrayList<Integer>(subset));
        //System.out.println(subset.stream().map( n -> String.valueOf(n)).collect((Collectors.joining(",", "{", "}"))));

        for(int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            helper(nums, res, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
