package leetcode.design;

public class MemoryAllocator {
    int[] mem;

    public MemoryAllocator(int n) {
        mem = new int[n];
    }
    
    public int allocate(int size, int mID) {
        int count = 0;
        for(int i  = 0; i < mem.length; i++) {
            if (mem[i] == 0) {
                count += 1;
            } else {
                count = 0;
            }

            if (count == size) {
                for(int j = i - size + 1; j <= i; j++) {
                    mem[j] = mID;
                }
                return  i - size + 1;
            }
        }
        return -1;
    }
    
    public int free(int mID) {
        int count = 0;
        for(int i = 0; i < mem.length; i++) {
            if (mem[i] == mID) {
                mem[i] = 0;
                count++;
            }
        }
        return count;
    }    
}
