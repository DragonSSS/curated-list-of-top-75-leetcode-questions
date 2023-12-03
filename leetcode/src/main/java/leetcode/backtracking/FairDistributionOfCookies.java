package leetcode.backtracking;

public class FairDistributionOfCookies {
    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        helper(cookies, 0, new int[k]);
        return res;
    }

    private void helper(int[] cookies, int index, int[] children) {
        if (cookies.length == index) {
            int max = 0;
            for(int child : children) {
                max = Math.max(max, child);
            }
            res = Math.min(res, max);
            return;
        }

        for(int i = 0; i < children.length; i++) {
            children[i] += cookies[index];
            helper(cookies, index + 1, children);
            children[i] -= cookies[index];
        }
    }    
}
