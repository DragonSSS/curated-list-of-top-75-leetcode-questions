package leetcode.bfs;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.LinkedList;

public class CourseScheduleII {
    public int[] findOrder_bfs(int numCourses, int[][] prerequisites) {
        // topological sort
        // build graph
        // build indegree map
        // bfs
        int[] res = new int[numCourses];
        boolean[] visited = new boolean[numCourses];
        int[] indegree = new int[numCourses];
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        for (int[] prerequisite : prerequisites) {
            int start = prerequisite[1];
            int end = prerequisite[0];
            indegree[end]++;
            graph.get(start).add(end);
        }
        
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                res[index++] = i;
                visited[i] = true;
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curCourse = queue.poll();
                for (int next : graph.get(curCourse)) {
                    if (visited[next])
                        continue;
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        res[index++] = next;
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
        }
 
        return index == numCourses? res : new int[]{};
    }

    // try dfs even bfs is clear
    int count = 0;
    public int[] findOrder_dfs(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        // 0 - unknown, 1 - visiting, 2 - visited
        int[] visited = new int[numCourses];
        // build graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        for (int[] prerequisite : prerequisites) {
            int start = prerequisite[1];
            int end = prerequisite[0];
            graph.get(start).add(end);
        }
        
        for (int i = 0; i < numCourses; i++) {
            if (isCircle(graph, i, res, visited))
                return new int[]{};
        }
        
        // reverse res array as it is stack
        int i = 0, j = res.length - 1;
        while(i <= j) {
            int temp = res[i];
            res[i++] = res[j];
            res[j--] = temp;
        }
        
        return res;
    }
    
    private boolean isCircle(Map<Integer, List<Integer>> graph, int curCourse, int[] res, int[] visited) {
        if (visited[curCourse] == 1)
            return true;
        
        if (visited[curCourse] == 2)
            return false;
        
        visited[curCourse] = 1;
        for (int next : graph.get(curCourse)) {
            if (isCircle(graph, next, res, visited)) {
                return true;
            }
        }
        visited[curCourse] = 2;
        res[count++] = curCourse;
        return false;
    }

    // int[1] -> int[0]
    // indegree[int[0]]++
    // computer indegree
    // build graph
    // bfs + visited hashset
    // return int[] res if possible
    // otherwise return new int[]{};
    public int[] findOrder_2r(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int[] indegree = new int[numCourses];
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        for(int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        for(int[] prerequisite : prerequisites) {
            int start = prerequisite[1];
            int end = prerequisite[0];
            indegree[end]++;
            graph.get(start).add(end);
        }
        
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        for(int i = 0; i < indegree.length; i++) {
            if(indegree[i] == 0) {
                res[index++] = i;
                queue.offer(i);
                visited.add(i);
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                for(int next : graph.get(cur)) {
                    if (visited.contains(next))
                        continue;
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        res[index++] = next;
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
        }
        
        return index == numCourses? res : new int[]{};
    }
}
