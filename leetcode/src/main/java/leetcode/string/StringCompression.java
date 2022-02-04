package leetcode.string;

import java.util.Arrays;

public class StringCompression {
    public int compress(char[] chars) {
        int i = 0, strSize = 0; 
        while(i < chars.length) {
            char c = chars[i];
            int blockSize = 1;
            int charIndex = strSize;
            i++;
            while( i < chars.length && chars[i] == chars[i - 1]) {
                blockSize++;
                i++;
            }
            
            if (blockSize == 1) {
                chars[charIndex] = c;
                strSize++;
            } else {
                chars[charIndex] = c;
                strSize++;
                String s = String.valueOf(blockSize);
                char[] numArr = s.toCharArray();
                for (int j = 0; j < numArr.length; j++) {
                    chars[charIndex + j + 1] = numArr[j];
                    strSize++;
                }
            }
        }
        chars = Arrays.copyOfRange(chars, 0, strSize);
        return chars.length;
    }    
}
