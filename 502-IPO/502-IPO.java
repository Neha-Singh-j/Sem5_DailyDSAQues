// Last updated: 8/21/2025, 11:49:48 AM
import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profit, int[] capital) {
        int n = profit.length;
        int[][] projects = new int[n][2];
        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profit[i];
        }

        Arrays.sort(projects, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> b[1] - a[1]);
        int i = 0;
        while(k>0){
            while(i<n && projects[i][0]<=w){
              pq.add(projects[i]);
                    i++;
            }
            if (pq.isEmpty()) {
                break;
            }
            w += pq.poll()[1];
           k--;
         }

        return w;  
    }
}
