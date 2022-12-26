package leetcode.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortIntegersByPowerValue {

    class Data {
        public int num;
        public int power;
        
        public Data(int num, int power) {
            this.num = num;
            this.power = power;
        }
    }

    Map<Integer, Integer> map = new HashMap<>();
    public int getKth(int lo, int hi, int k) {
       int n = hi - lo + 1;
       Data[] arr = new Data[n];
       
       for(int i = lo; i <= hi; i++) {
           int index = i - lo;
           int power = findPower(i);
           arr[index] = new Data(i, power);
       }
       
       Arrays.sort(arr, (a, b) -> b.power != a.power ? a.power - b.power : a.num - b.num);
       return arr[k - 1].num;
   }
   
   private int findPower(int num) {
       if (num == 1)
           return 0;
       
       if (map.containsKey(num))
           return map.get(num);
       
       int res = 0;
       if (num % 2 == 0) {
           res = 1 + findPower(num / 2);
       } else {
           res = 1 + findPower(num * 3 + 1);
       }
       
       map.put(num, res);
       return res;
   }
}
