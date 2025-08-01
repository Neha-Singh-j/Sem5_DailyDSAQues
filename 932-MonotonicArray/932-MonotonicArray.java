// Last updated: 8/1/2025, 10:35:11 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean flag1=true,flag2=true;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]<=nums[j+1]){

            }else{
                flag1=false;
            }
        }
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]>=nums[j+1]){

            }else{
                flag2=false;
            }
           
        }
        if(flag1|| flag2){
            return true;
        }
        return false;
    }
}