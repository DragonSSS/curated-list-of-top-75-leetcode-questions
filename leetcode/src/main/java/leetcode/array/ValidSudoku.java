package leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    // the number of boxes is 9
    // 0, 1, 2, 3, 4, 5, 6, 7, 8
    // the index of box is (r / 3) * 3 + (c / 3)
    public boolean isValidSudoku(char[][] board) {
        int size = 9;
        Set<Character>[] rows = new HashSet[size];
        Set<Character>[] cols = new HashSet[size];
        Set<Character>[] boxes = new HashSet[size];
        for(int i = 0; i < size; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r = 0; r < size; r++) {
            for(int c = 0; c < size; c++) {
                if(board[r][c] == '.') {
                    continue;
                }

                char cur = board[r][c];
                if (rows[r].contains(cur)) {
                    return false;
                }
                rows[r].add(cur);

                if (cols[c].contains(cur)) {
                    return false;
                }
                cols[c].add(cur);

                int index = (r / 3) * 3 + (c / 3);
                if(boxes[index].contains(cur)) {
                    return false;
                }
                boxes[index].add(cur);
            }
        }
        return true;
    }    
}
