// Last updated: 8/1/2025, 10:36:37 PM
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
PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            int index = 0;
        for (int i = 0; i < k; i++) {
            
            while(index<n && projects[index][0]<=w){
              pq.add(projects[index][1]);
                    index++;
            }

           if(!pq.isEmpty()){

             w += pq.poll();
           }
             
        }

        return w;  
    }
}
