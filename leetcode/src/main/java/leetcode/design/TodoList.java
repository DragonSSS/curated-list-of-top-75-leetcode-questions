package leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TodoList {
    class Task {
        int taskId;
        String description;
        int dueDate;
        Set<String> tags;
        boolean completed;

        public Task(int taskId, String description, int dueDate, List<String> tags) {
            this.taskId = taskId;
            this.description = description;
            this.dueDate = dueDate;
            this.tags = new HashSet<>(tags);
            this.completed = false;
        }
    }
    // task -> id description, dueDate, tags, completed
    // user -> list of tasks

    int taskId = 1;
    Map<Integer, List<Task>> map;

    public TodoList() {
        map = new HashMap<>();
    }

    public int addTask(int userId, String taskDescription, int dueDate, List<String> tags) {
        map.putIfAbsent(userId, new ArrayList<>());
        int curId = taskId;
        map.get(userId).add(new Task(taskId++, taskDescription, dueDate, tags));
        return curId;
    }

    public List<String> getAllTasks(int userId) {
        return getAllTasksPerUser(userId, Optional.empty());
    }

    public List<String> getTasksForTag(int userId, String tag) {
        return getAllTasksPerUser(userId, Optional.of(tag));
    }

    public void completeTask(int userId, int taskId) {
        map.getOrDefault(userId, new ArrayList<>()).stream().filter(task -> task.taskId == taskId)
                .forEach(task -> task.completed = true);
    }

    private List<String> getAllTasksPerUser(int userId, Optional<String> tag) {
        return map.getOrDefault(userId, new ArrayList<>()).stream()
                .filter(task -> !task.completed
                        && (!tag.isPresent() || task.tags.contains(tag.get())))
                .sorted((a, b) -> a.dueDate - b.dueDate).map(task -> task.description)
                .collect(Collectors.toList());
    }
}
