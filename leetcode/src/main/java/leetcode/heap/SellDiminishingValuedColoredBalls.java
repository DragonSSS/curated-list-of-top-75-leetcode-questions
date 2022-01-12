package leetcode.heap;

import java.util.PriorityQueue;

public class SellDiminishingValuedColoredBalls {
    // unit class
    class Ball {
        long value; // cound be big
        int count; // use to merge two balls if their values are identical

        public Ball(long value, int count) {
            this.value = value;
            this.count = count;
        }
    }

    public int maxProfit(int[] inventory, int orders) {
        PriorityQueue<Ball> pq = new PriorityQueue<>((a, b) -> Long.compare(b.value, a.value));

        for (int val : inventory) {
            pq.offer(new Ball(val, 1));
        }

        long res = 0;
        while(!pq.isEmpty() && orders > 0) {
            Ball curBall = pq.poll();

            // merge with peak of pq if their values are identical
            while(!pq.isEmpty() && pq.peek().value == curBall.value) {
                curBall.count += pq.poll().count;
            }

            long diff = pq.isEmpty()? curBall.value : curBall.value - pq.peek().value;

            // fit all balls between current value and next ball with greatest value in pq
            if ( curBall.count * diff <= orders ) {
                orders -= curBall.count * diff;
                res += curBall.count * sumBetweenTwoValues(curBall.value, curBall.value - diff);

                if (curBall.value - diff > 0) {
                    pq.offer(new Ball(curBall.value - diff, curBall.count));
                }
            } else { // use all orders
                int length = orders / curBall.count;
                res += curBall.count * sumBetweenTwoValues(curBall.value, curBall.value - length);

                res += (orders % curBall.count) * (curBall.value - length);
                orders = 0;
            }
        }
        return (int) (res % 1000000007);
    }

    private long sumBetweenTwoValues(long a, long b) {
        return (a *(a + 1)) / 2 - (b *(b + 1)) / 2;
    }
}
