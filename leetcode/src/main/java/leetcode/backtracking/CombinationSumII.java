package leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // O(nlogn)
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        helper(0, candidates, target, cur, res);
        return  res;
    }

    private void helper(int index, int[]candidates,  int target, List<Integer> cur, List<List<Integer>> res) {
        if(target < 0)
            return;

        if(target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int i = index; i < candidates.length; i++) {
            if(i > index && candidates[i] == candidates[i - 1]) continue;
            cur.add(candidates[i]);
            helper(i + 1, candidates, target - candidates[i], cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}
