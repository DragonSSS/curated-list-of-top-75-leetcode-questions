package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    public List<Integer> mergeTwoArrays(List<Integer> a, List<Integer> b) {
        int p1 = 0;
        int p2 = 0;

        List<Integer> result = new ArrayList<>(a.size() + b.size());
        while (p1 < a.size() && p2 < b.size()) {
            if (a.get(p1) < b.get(p2)) {
                result.add(a.get(p1));
                p1++;
            } else {
                result.add(b.get(p2));
                p2++;
            }
        }

        while(p1 <= a.size() - 1) {
            result.add(a.get(p1));
            p1++;
        }

        while(p2 <= b.size() - 1) {
            result.add(b.get(p2));
            p2++;
        }

        return result;
    }
}
