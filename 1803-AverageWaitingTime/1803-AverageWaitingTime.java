// Last updated: 8/1/2025, 10:33:21 PM
class Solution {
    public double averageWaitingTime(int[][] arr) {
        int finisht=arr[0][0]+arr[0][1];
        double wait=finisht-arr[0][0];
        int currWait=0;
        for(int i=1;i<arr.length;i++){
           
            if (arr[i][0] > finisht) {
                finisht = arr[i][0] + arr[i][1];
            } else {
                finisht += arr[i][1];
            }
  currWait = finisht - arr[i][0];
wait+=currWait;
 
        }
        return wait/arr.length;
    }
}