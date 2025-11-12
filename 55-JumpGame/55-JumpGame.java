// Last updated: 11/12/2025, 7:47:14 PM
class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxReach=0;
        for(int i=0;i<n;i++){
            if(i>maxReach){
                return false;
            }
            maxReach=Math.max(maxReach,i+nums[i]);
            if(maxReach>=n-1){
                return true;
            }
        }
        return true;
    }
}