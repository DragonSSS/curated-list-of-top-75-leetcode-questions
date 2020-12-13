package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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
}
