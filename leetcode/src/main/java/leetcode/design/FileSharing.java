package leetcode.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class FileSharing {
    PriorityQueue<Integer> pq;
    Map<Integer, Set<Integer>> map;
    public FileSharing(int m) {
        pq = new PriorityQueue<>();
        map = new HashMap<>();
        pq.offer(1);
    }
    
    public int join(List<Integer> ownedChunks) {
        // assign userId
        // add chunks under userId
        int id = pq.poll();
        if (pq.isEmpty()) {
            pq.offer(id + 1);
        }
        map.put(id, new HashSet<>(ownedChunks));
        return id;
    }
    
    public void leave(int userID) {
        map.remove(userID);
        pq.offer(userID);
    }
    
    public List<Integer> request(int userID, int chunkID) {
        List<Integer> res = new ArrayList<>();
        for(int id : map.keySet()) {
            if (map.get(id).contains(chunkID)) {
                res.add(id);
            }
        }
        if (!res.isEmpty()) {
            map.get(userID).add(chunkID);
        }
        Collections.sort(res);
        return res;
    }    
}
