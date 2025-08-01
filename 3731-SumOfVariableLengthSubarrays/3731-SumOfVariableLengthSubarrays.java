// Last updated: 8/1/2025, 10:31:16 PM
class Solution {
    public int subarraySum(int[] nums) {
        int start=0;
        int Sum=0;
        for(int i=0;i<nums.length;i++){
             start=Math.max(0,i-nums[i]);
            
            for(int j=start;j<=i;j++){
               Sum+=nums[j];
            }
            
        }
        return Sum;
    }
}