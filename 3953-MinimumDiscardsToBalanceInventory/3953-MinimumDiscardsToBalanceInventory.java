// Last updated: 9/25/2025, 9:38:03 AM
import java.util.*;

class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int[] arr = arrivals;

        int n = arr.length;
        int dscrd = 0;

        Map<Integer, Integer> cnt = new HashMap<>();
        Queue<int[]> q = new LinkedList<>(); 
        for (int i = 0; i < n; i++) {
            int item = arr[i];
               while (!q.isEmpty() && q.peek()[0] <= i - w) {
                int[] pre = q.poll();
                cnt.put(pre[1], cnt.get(pre[1]) - 1);
                if (cnt.get(pre[1]) == 0) {
                    cnt.remove(pre[1]);
                }
            }

            if (cnt.getOrDefault(item, 0) < m) {
                q.offer(new int[]{i, item});
                cnt.put(item, cnt.getOrDefault(item, 0) + 1);
            } else {
                dscrd++;
            }
        }

        return dscrd;
    }
}
