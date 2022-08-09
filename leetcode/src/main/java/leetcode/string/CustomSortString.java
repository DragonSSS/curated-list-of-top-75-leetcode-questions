package leetcode.string;

public class CustomSortString {
    // order: cba
    // string: abcd
    // output: cbad
    public String customSortString(String order, String s) {
        // use hashmap to store char freq of s
        // use order str to build result str
        // append the rest of char at end if it doesn't exist in order str
        int[] freq = new int[26];
        
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray()) {
            while(freq[c - 'a']-- > 0) {
                sb.append(c);
            }
        }
        
        for(int i = 0; i < 26; i++) {
            while(freq[i]-- > 0) {
                sb.append((char)(i + 'a'));
            }
        }
        return sb.toString();
    }    
}
