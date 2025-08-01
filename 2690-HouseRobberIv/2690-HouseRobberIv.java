// Last updated: 8/1/2025, 10:32:06 PM
class Solution {
    public int minCapability(int[] nums, int k) {
        int lo=0;
        int hi=0;
        for(int n:nums){
            lo=Math.min(lo,n);
            hi=Math.max(n,hi);
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isItPossible(nums,mid,k)){
              
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return lo;
    }
    public static boolean isItPossible(int[] nums,int mid,int k){
        int house=0;


        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                house++;
                i++;
            }
        }
        return house>=k;

    }
}