// Last updated: 8/1/2025, 10:37:13 PM
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        if(n<3){
            return 0;
        }
        int count=1;
        int ans=0;
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                ans+=count++;
            }else{
                count=1;
            }
        }
        return ans;
    }
}