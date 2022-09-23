package leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Twitter {
    int timestamp = 0;
    Map<Integer, User> userMap;
    
    class Tweet {
        int id;
        Tweet next;
        int time;
        
        public Tweet(int id) {
            this.id = id;
            time = timestamp++;
            next = null;
        }
    }
    
    class User {
        Set<Integer> followed;
        int id;
        Tweet head;
        
        public User(int id) {
            this.id = id;
            followed = new HashSet<>();
            follow(id);
            head = null;
        }
        
        public void follow(int id) {
            followed.add(id);
        }
        
        public void unfollow(int id) {
            followed.remove(id);
        }
        
        public void post(int id) {
            Tweet tweet = new Tweet(id);
            tweet.next = head;
            head = tweet;
        }
    }
    
    public Twitter() {
        userMap = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        userMap.putIfAbsent(userId, new User(userId));
        userMap.get(userId).post(tweetId);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if (!userMap.containsKey(userId)) {
            return res;
        }
        
        Set<Integer> followedIds = userMap.get(userId).followed;
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a, b) -> b.time - a.time);
        for(int id : followedIds) {
            User user = userMap.get(id);
            if (user.head != null) {
                pq.offer(user.head);
            }
        }
        
        int count = 0;
        while(!pq.isEmpty() && count < 10) {
            Tweet tweet = pq.poll();
            res.add(tweet.id);
            count++;
            if (tweet.next != null) {
                pq.offer(tweet.next);
            }
        }
        
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        userMap.putIfAbsent(followerId, new User(followerId));
        userMap.putIfAbsent(followeeId, new User(followeeId));
        userMap.get(followerId).follow(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId) || followerId==followeeId)
			return;
		userMap.get(followerId).unfollow(followeeId);
    }    
}
