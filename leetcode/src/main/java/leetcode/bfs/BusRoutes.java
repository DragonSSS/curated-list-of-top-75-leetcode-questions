package leetcode.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
public class BusRoutes {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        // find shortest number of buses from source to target: bfs
        // build graph based which buses could reach each stop: key is a stop, value is the list of buses
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            int[] route = routes[i];
            for (int j = 0; j < route.length; j++) {
                graph.putIfAbsent(route[j], new ArrayList<>());
                graph.get(route[j]).add(i);
            }
        }

        // edge cases
        if (!graph.containsKey(source) || !graph.containsKey(target)) {
            return -1;
        }

        if (source == target) {
            return 0;
        }

        // bfs via queue of stops
        // make sure we won't visited duplicated stop and take duplicated bus via HashSet
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> stopVisited = new HashSet<>();
        Set<Integer> busTaken = new HashSet<>();

        queue.offer(source);
        stopVisited.add(source);
        int count = 0;
        while(!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curStop = queue.poll();
                for (int bus : graph.get(curStop)) {
                    if (!busTaken.contains(bus)) {
                        busTaken.add(bus);
                        for (int nextStop : routes[bus]) {
                            if (!stopVisited.contains(nextStop)) {
                                if (nextStop == target) {
                                    return count;
                                } else {
                                    stopVisited.add(nextStop);
                                    queue.offer(nextStop);
                                }
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    // bfs
    // graph: stop -> next buses can be taken;
    // next bus -> which stop can go next;
    public int numBusesToDestination_2r(int[][] routes, int source, int target) {
        Map<Integer, Set<Integer>> stopToBuses = new HashMap<>();
        Set<Integer> takenBus = new HashSet<>();
        Set<Integer> visitedStop = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < routes.length; i++) {
            int[] stopsOnBus = routes[i];
            for(int stop : stopsOnBus) {
                stopToBuses.putIfAbsent(stop, new HashSet<>());
                stopToBuses.get(stop).add(i);
            }
        }
        
        if (!stopToBuses.containsKey(source) || !stopToBuses.containsKey(target)) {
            return -1;
        }

        if (source == target) {
            return 0;
        }

        queue.offer(source);
        visitedStop.add(source);

        int res = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int curStop = queue.poll();
                if(curStop == target) {
                    return res;
                }

                if(!stopToBuses.containsKey(curStop)) {
                    continue;
                }

                for(int bus : stopToBuses.get(curStop)) {
                    if(takenBus.contains(bus)) {
                        continue;
                    }

                    takenBus.add(bus);
                    for(int nextStop : routes[bus]) {
                        if(visitedStop.contains(nextStop)) {
                            continue;
                        }
                        queue.offer(nextStop);
                        visitedStop.add(nextStop);
                    }
                }
            }
            res++;
        }
        return -1;
    }
}
