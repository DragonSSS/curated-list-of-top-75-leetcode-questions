package leetcode.array;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class AnalyzeUserWebsiteVisitPattern {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        // build userToSite map via treeMap
        Map<String, TreeMap<Integer, String>> userToSiteMap = new HashMap<>();
        for (int i = 0; i< username.length; i++) {
            userToSiteMap.putIfAbsent(username[i], new TreeMap<>());
            TreeMap<Integer, String> timeToSiteMap = userToSiteMap.get(username[i]);
            timeToSiteMap.put(timestamp[i], website[i]);
            userToSiteMap.put(username[i], timeToSiteMap);
        }
        
        // build sequence count map
        Map<String, Integer> sequenceCountMap = new HashMap<>();
        for(String user : userToSiteMap.keySet()) {
            TreeMap<Integer, String> timeToSiteMap = userToSiteMap.get(user);
            if (timeToSiteMap.size() < 3) {
                continue;
            } else {
                // build sequence first
                List<Integer> times = new ArrayList<>();
                for (Integer time : timeToSiteMap.keySet()) {
                    times.add(time);
                }
                List<String> sequences = findAllSequence(times, timeToSiteMap);
                Set<String> visited = new HashSet<>();
                for (String sequence : sequences) {
                    if (!visited.contains(sequence)) {
                        visited.add(sequence);
                        sequenceCountMap.put(sequence, sequenceCountMap.getOrDefault(sequence, 0) + 1);
                    }
                }
            }
        }
            
        List<String> res = new ArrayList<>();
        int count = 0;
        String str = null;
        for (String sequence : sequenceCountMap.keySet()) {
            if (sequenceCountMap.get(sequence) > count) {
                str = sequence;
                count = sequenceCountMap.get(sequence);
            } else if (sequenceCountMap.get(sequence) == count) {
                if (sequence.compareTo(str) < 0) {
                    str = sequence;
                }
            }
        }
            
        for (String site : str.split("->")) {
            res.add(site);
        }
        return res;
    }
    
    private List<String> findAllSequence(List<Integer> times, TreeMap<Integer, String> timeToSiteMap) {
        List<String> res = new ArrayList<>();
        // times size >= 3;
        for (int i = 0; i < times.size() - 2; i++) {
            for (int j = i + 1; j < times.size() - 1; j++) {
                for (int k = j + 1; k < times.size(); k++) {
                    res.add(timeToSiteMap.get(times.get(i)) + "->" + timeToSiteMap.get(times.get(j)) + "->" + timeToSiteMap.get(times.get(k)));
                }
            }
        }
        return res;
    }
}
