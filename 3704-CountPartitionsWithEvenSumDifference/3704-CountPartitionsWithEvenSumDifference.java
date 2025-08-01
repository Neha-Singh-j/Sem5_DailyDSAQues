// Last updated: 8/1/2025, 10:31:24 PM
class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int count=0;
        int s2=0;
         for(int i=0;i<nums.length-1;i++){
             
             s2+=nums[i];
             int curr=sum-s2;
             if(Math.abs(curr-s2)%2==0){
                 count++;
             }
         }
        return count;
    }
}