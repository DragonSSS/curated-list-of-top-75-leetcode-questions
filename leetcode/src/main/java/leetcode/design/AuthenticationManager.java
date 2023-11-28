package leetcode.design;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AuthenticationManager {
    int ttl;
    Map<String, Integer> tokenToExpiry;
    public AuthenticationManager(int timeToLive) {
        this.ttl = timeToLive;
        tokenToExpiry = new HashMap<>();
    }
    
    public void generate(String tokenId, int currentTime) {
        tokenToExpiry.put(tokenId, currentTime + ttl);
    }
    
    public void renew(String tokenId, int currentTime) {
        clean(currentTime);
        if (tokenToExpiry.containsKey(tokenId)) {
            tokenToExpiry.remove(tokenId);
            tokenToExpiry.put(tokenId, currentTime + ttl);
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        clean(currentTime);
        return tokenToExpiry.size();
    }

    private void clean(int currentTime) {
        Set<String> remove = new HashSet<>();
        for(Map.Entry<String, Integer> entry : tokenToExpiry.entrySet()) {
            if (entry.getValue() <= currentTime) {
                remove.add(entry.getKey());
            }
        }

        for(String key : remove) {
            tokenToExpiry.remove(key);
        }
    }    
}
