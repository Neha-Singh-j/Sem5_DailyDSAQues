// Last updated: 8/1/2025, 10:41:26 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxs=Integer.MIN_VALUE;
         int curr=0;
        for(int i=0;i<nums.length;i++){
           curr+=nums[i];
           maxs=Math.max(curr,maxs);
            
            if(curr<0){
                curr=0;
            }
                
        }
        return maxs;
    }
}