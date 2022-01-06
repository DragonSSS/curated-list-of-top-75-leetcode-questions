package leetcode.array;

import java.util.Arrays;

public class ReorderDataInLogFiles {

    // public String[] reorderLogFiles(String[] logs) {
    //     List<String> letters = new ArrayList<>();
    //     List<String> digits = new ArrayList<>();
        
    //     if (logs == null || logs.length == 0)
    //         return letters.toArray(new String[0]);
        
    //     for (String log : logs) {
    //         String[] words = log.split(" ");
            
    //         if (Character.isLetter(words[1].charAt(0))) {
    //             letters.add(log);
    //         } else {
    //             digits.add(log);
    //         }
    //     }
        
    //     Comparator<String> comparator = new Comparator<String>(){
            
    //         @Override
    //         public int compare(String s1, String s2) {
    //             int index1 = s1.indexOf(' ');
    //             int index2 = s2.indexOf(' ');
                
    //             String flag1 = s1.substring(0, index1);
    //             String flag2 = s2.substring(0, index2);
                
    //             String rest1 = s1.substring(index1 + 1);
    //             String rest2 = s2.substring(index2 + 1);
                
    //             int rest = rest1.compareTo(rest2);
                
    //             return rest == 0 ? flag1.compareTo(flag2) : rest;
    //         }
    //     };
        
    //     Collections.sort(letters, comparator);
        
    //     letters.addAll(digits);
        
    //     return letters.toArray(new String[letters.size()]);
    // }

    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (s1, s2) -> {
            String[] parts1 = s1.split(" ", 2);
            String[] parts2 = s2.split(" ", 2);
            
            boolean isDigit1 = Character.isDigit(parts1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(parts2[1].charAt(0));
            
            if (!isDigit1 && !isDigit2) {
                int comp = parts1[1].compareTo(parts2[1]);
                if (comp == 0) return parts1[0].compareTo(parts2[0]);
                else return comp;
            } else if (isDigit1 && isDigit2) {
                return 0;
            } else if (isDigit1 && !isDigit2) {
                return 1;
            } else { // !isDigit1 && isDigit2
                return -1;
            }
        });
        
        return logs;
    }
}
