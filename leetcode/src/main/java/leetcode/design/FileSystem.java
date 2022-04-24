package leetcode.design;

import java.util.HashMap;
import java.util.Map;

public class FileSystem {
    class File{
        Integer value;
        Map<String, File> children;
        
        public File(){
            this.value = null;
            children = new HashMap<>();
        }
    }

    File root;
    public FileSystem() {
        root = new File();
    }
    
    public boolean createPath(String path, int value) {
        File node = root;
        String[] subPaths = path.split("/");
        for(int i = 0; i < subPaths.length; i++) {
            String subPath = subPaths[i];
            if(subPath.length() == 0)
                continue;
            if(!node.children.containsKey(subPath)) {
                if (i == subPaths.length - 1) {
                    node.children.put(subPath, new File());
                } else {
                    return false;
                }
            }
            node = node.children.get(subPath);
        }
        if (node.value != null)
            return false;
        
        node.value = value;
        return true;
    }
    
    public int get(String path) {
        File node = root;
        String[] subPaths = path.split("/");
        for(String subPath : subPaths) {
            if(subPath.length() == 0)
                continue;
            if(!node.children.containsKey(subPath)) {
                return -1;
            }
            node = node.children.get(subPath);
        }
        
        return node.value == null? -1 : node.value;
    }    
}
