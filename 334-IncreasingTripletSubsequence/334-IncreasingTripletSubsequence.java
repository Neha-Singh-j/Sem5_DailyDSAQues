// Last updated: 8/1/2025, 10:37:47 PM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(m1>=nums[i]){
                m1=nums[i];
            }else if(m2>=nums[i]){
                m2=nums[i];
            }else if(m2<nums[i]){
                return true;
            }
        }
        return false;
    }
}