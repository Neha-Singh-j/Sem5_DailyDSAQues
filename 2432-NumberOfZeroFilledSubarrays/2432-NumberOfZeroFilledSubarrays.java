// Last updated: 8/1/2025, 10:32:38 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        long count=0;
        long ans=0;
        int i=0;
        while(i<n){
            if(nums[i]==0){
                count++;
                ans+=count;
            }else{
                count=0;
            }
            i++;
        }
        return ans;
    }
}