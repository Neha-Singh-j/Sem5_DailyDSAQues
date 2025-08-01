// Last updated: 8/1/2025, 10:39:41 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        for(int j=0;j<gas.length;j++){
           total+=gas[j]-cost[j];
        }
        if(total<0){
            return -1;
        }
         int indx=0;
        int curr=0;
     
    for(int j=0;j<gas.length;j++){
        curr+=gas[j]-cost[j];
        if(curr<0){
            curr=0;
            indx=j+1;
        }
      }  
      return indx;
    }
}