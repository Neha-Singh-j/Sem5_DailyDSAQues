// Last updated: 8/1/2025, 10:31:12 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
           max=Math.max(nums[i]-nums[i-1],max);
            }else{
                max=Math.max(nums[i-1]-nums[i],max);
            }
        }

        if(nums[n-1]-nums[0]>max){
            max=nums[n-1]-nums[0];
        }else if(nums[0]-nums[n-1]>max){
            max=nums[0]-nums[n-1];
        }
        return max;
    }
}