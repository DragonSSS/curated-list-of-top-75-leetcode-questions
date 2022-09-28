package leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class FindAllPossibleRecipesFromGivenSupplies {
    // recipes = bread
    // ingredients = yeast, flour
    // yeast -> bread, flour -> bread
    // indegree[bread] = 2;
    
    // graph Map<String, Set<String>>
    // visited Set<String> ?
    // indegree Map<String, Integer>
    // bfs Queue<String>;
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Set<String>> graph = new HashMap<>();
        Map<String, Integer> indegree = new HashMap<>();
        Set<String> recipesSet = new HashSet<>();
        List<String> res = new ArrayList<>();
        
        for(int i = 0; i < recipes.length; i++) {
            recipesSet.add(recipes[i]);
            for (String ingredient : ingredients.get(i)) {
                graph.putIfAbsent(ingredient, new HashSet<>());
                graph.get(ingredient).add(recipes[i]);
                indegree.put(recipes[i], indegree.getOrDefault(recipes[i], 0) + 1);
            }
        }
        
        Queue<String> queue = new LinkedList<>();
        for(String supply : supplies) {
            if (recipesSet.contains(supply)) {
                res.add(supply);
            } else {
                queue.offer(supply);
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                if (recipesSet.contains(cur)) {
                   res.add(cur);
                }
                if (!graph.containsKey(cur)) {
                    continue;
                }
                for(String next : graph.get(cur)) {
                    indegree.put(next, indegree.get(next) - 1);
                    if (indegree.get(next) == 0) {
                        queue.offer(next);
                    }
                }
            }
        } 
        return res;
    }    
}
