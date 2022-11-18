package leetcode.string;

public class ShortestWayToFormString {
    public int shortestWay(String source, String target) {
        int indexTarget = 0;
        int res = 0;
        while(indexTarget < target.length()) {
            boolean match = false;
            for(int i = 0; i < source.length() && indexTarget < target.length(); i++) {
                if(target.charAt(indexTarget) == source.charAt(i)) {
                    indexTarget++;
                    match = true;
                }
            }
            if (!match) {
                return -1;
            }
            res++;
        }
        return res;
    }
}
