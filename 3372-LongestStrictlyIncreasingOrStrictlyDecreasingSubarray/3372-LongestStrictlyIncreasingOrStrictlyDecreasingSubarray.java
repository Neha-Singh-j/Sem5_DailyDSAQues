// Last updated: 8/1/2025, 10:31:45 PM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=0;
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                c++;
            }else{
                max=Math.max(max,c);
                c=1;
            }
        }
        max=Math.max(max,c);
        c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                c++;
            }else{
                max=Math.max(max,c);
                c=1;
            }
        }
        max=Math.max(max,c);
return max;
    }
}