package leetcode.backtracking;

public class MaximumGoodPeopleBasedOnStatements {
    // dfs + backtracking
    int res = 0;
    public int maximumGood(int[][] statements) {
        int n = statements.length;
        helper(statements, new StringBuilder(), 0, 0, n);
        return res;
    }
    
    private void helper(int[][] statements, StringBuilder personStrBuilder, int curPerson, int numberOfGood, int totalPerson) {
        if (curPerson == totalPerson) {
            if (isValid(statements, personStrBuilder.toString())) {
                res = Math.max(res, numberOfGood);
            }
            return;
        }
        
        // bad guy
        personStrBuilder.append('0');
        helper(statements, personStrBuilder, curPerson + 1, numberOfGood, totalPerson);
        // backtracking + good guy
        personStrBuilder.setCharAt(personStrBuilder.toString().length()-1, '1');
        helper(statements, personStrBuilder, curPerson + 1, numberOfGood + 1, totalPerson);
        // backtracking
        personStrBuilder.deleteCharAt(personStrBuilder.toString().length() - 1);
    }
    
    
    private boolean isValid(int[][] statements, String persons) {
        for (int i = 0; i < persons.length(); i++) {
            if (persons.charAt(i) == '1') { // if person is good
                for (int j = 0; j < statements[0].length; j++) {
                    // find conflict if exists
                    if (statements[i][j] != 2 && statements[i][j] != (persons.charAt(j) - '0'))
                        return false;
                }
            }
        }
        
        return true;
    }   
}
