package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CourseSchedule {
    // [0, 1]  0 <- 1
    // indegree[0]++
    // if indegree[num] == 0; the course can be taken
    // build graph map<course, courses can be taken after take the course>
    // using queue, numOfCourse++ if does poll;
    // return numOfCourse == numCourses
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 1 <= numCourses <= 10^5
        if(numCourses == 1)
            return true;

        int[] indegree = new int[numCourses];

        for(int i = 0; i < prerequisites.length; i++) {
            indegree[prerequisites[i][0]]++;
        }

        // build graph
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < prerequisites.length; i++) {
            if(!map.containsKey(prerequisites[i][1])) {
                map.put(prerequisites[i][1], new ArrayList<>());
            }
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < indegree.length; i++) {
            if(indegree[i] == 0)
                queue.offer(i);
        }

        int res = 0;

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            res++;
            if (map.containsKey(cur)) {
                for (Integer course : map.get(cur)) {
                    indegree[course]--;

                    if(indegree[course] == 0)
                        queue.offer(course);
                }
            }
        }

        return res == numCourses;
    }

    public boolean canFinish_2r(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        int[] indegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        // [a, b] => b -> a
        int count = 0;
        for(int[] prerequisite : prerequisites) {
            int first = prerequisite[1];
            int second = prerequisite[0];
            indegree[second]++;
            graph.get(first).add(second);
        }
        
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                queue.offer(i);
                visited.add(i);
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                count++;
                for(int next : graph.get(cur)) {
                    if(visited.contains(next))
                        continue;
                    indegree[next]--;
                    if(indegree[next] == 0) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
        }
        
        return count == numCourses;
    }
}
