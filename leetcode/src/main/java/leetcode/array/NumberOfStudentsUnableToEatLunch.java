package leetcode.array;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int res = students.length;
        int[] map = new int[2];
        for(int student : students) {
            map[student]++;
        }
        for(int sandwich : sandwiches) {
            if (map[sandwich] > 0) {
                map[sandwich]--;
                res--;
            } else {
                return res;
            }
        }
        return res;
    }    
}
