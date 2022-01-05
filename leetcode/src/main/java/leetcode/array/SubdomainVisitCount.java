package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {
    // hashtable: key is domian, value is hit counts
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] parts = cpdomain.split(" ");
            int times = Integer.valueOf(parts[0]);
            String domain = parts[1];
            String[] subdomains = domain.split("\\."); // escape dot otherwise it means any char in regex
            String temp = "";
            for (int i = subdomains.length - 1; i >= 0; i--) {
                temp = temp == "" ? subdomains[i] : subdomains[i] + "." + temp;
                int curTime = map.getOrDefault(temp, 0);
                map.put(temp, curTime + times);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            String str = entry.getValue() + " " + entry.getKey();
            res.add(str);
        }
        return res;
    }
}
