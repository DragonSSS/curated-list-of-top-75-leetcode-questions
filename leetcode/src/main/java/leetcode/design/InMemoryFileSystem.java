package leetcode.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryFileSystem {

    // unit class of trie
    class File {
        boolean isFile = false;
        String content = "";
        Map<String, File> children = new HashMap<>();
    }
    
    File root = null;

    public InMemoryFileSystem() {
        root = new File();
    }
    
    public List<String> ls(String path) {
        List<String> res = new ArrayList<>();
        String[] dirs = path.split("/");
        File node = root;
        String name = "";
        for (String dir : dirs) {
            if (dir.length() == 0)
                continue;
            node.children.putIfAbsent(dir, new File());
            node = node.children.get(dir);
            name = dir;
        }
        
        if (node.isFile) {
            res.add(name);
        } else {
            res.addAll(node.children.keySet());
        }
        
        Collections.sort(res);
        return res;
    }
    
    public void mkdir(String path) {
        String[] dirs = path.split("/");
        File node = root;
        for (String dir : dirs) {
            if (dir.length() == 0)
                continue;
            node.children.putIfAbsent(dir, new File());
            node = node.children.get(dir);
        }
    }
    
    public void addContentToFile(String filePath, String content) {
        String[] dirs = filePath.split("/");
        File node = root;
        for (String dir : dirs) {
            if (dir.length() == 0)
                continue;
            node.children.putIfAbsent(dir, new File());
            node = node.children.get(dir);
        }
        node.isFile = true;
        node.content += content;
    }
    
    public String readContentFromFile(String filePath) {
        String[] dirs = filePath.split("/");
        File node = root;
        for (String dir : dirs) {
            if (dir.length() == 0)
                continue;
            node.children.putIfAbsent(dir, new File());
            node = node.children.get(dir);
        }
        return node.content;
    }
}
