// Last updated: 8/1/2025, 10:39:13 PM
class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int currDiff=nums[i+1]-nums[i];
            if(currDiff>maxi){
                maxi=currDiff;
            }
        }
        return maxi;
    }
}