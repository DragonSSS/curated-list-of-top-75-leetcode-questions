package leetcode.array;

public class PlatesBetweenCandles {
    // "*|**|***|"
    // query [0, 5]
    // * | * * | *
    // 0 1 2 3 4 5
    // total = 5 - 1 + 1 = 6
    // total candles = candlePrefixSum[4](2) - candlePrefixSum[1](1) + 1 = 2
    // total plates = 4 (right candle - left candle + 1) - 2 = 4
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] firstRightCandle = new int[n];
        int[] firstLeftCandle = new int[n];
        int[] candlePrefixSum = new int[n];
        int[] res = new int[queries.length];
        
        int candleIndex = -1;
        for(int i = 0; i < n; i++) {
            if (s.charAt(i) == '|') {
                candleIndex = i;
            }
            firstLeftCandle[i] = candleIndex;
        }
        
        candleIndex = -1;
        for(int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                candleIndex = i;
            }
            firstRightCandle[i] = candleIndex;
        }
        
        int curCount = 0;
        for(int i = 0; i < n; i++) {
            if (s.charAt(i) == '|') {
                curCount += 1;
            }
            candlePrefixSum[i] = curCount;
        }
        
        int index = 0;
        for(int[] query : queries) {
            int left = query[0], right = query[1];
            
            int leftCandle = firstRightCandle[left];
            int rightCandle = firstLeftCandle[right];
            
            // if one side there is no candle at all
            if (leftCandle == -1 || rightCandle == -1) {
                res[index] = 0;
            } else {
                // this is to check the case |**| with query [1, 2]
                // query could be [1, 1] as well
                // distance is negative or zero
                int distance = rightCandle - leftCandle;
                if (distance > 1) {
                    res[index] = rightCandle - leftCandle + 1 - (candlePrefixSum[rightCandle] - candlePrefixSum[leftCandle] + 1);
                } else {
                    // || case
                    res[index] = 0;
                }
            }
            index++;
        }
        return res;
    }    
}
