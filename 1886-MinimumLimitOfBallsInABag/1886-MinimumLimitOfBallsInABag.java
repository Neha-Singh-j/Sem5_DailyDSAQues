// Last updated: 8/1/2025, 10:33:11 PM
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int lo=1;
       int n=nums.length;
       Arrays.sort(nums);
        int hi=nums[n-1];
int ans=-1;
while(lo<=hi){
    int mid=lo+(hi-lo)/2;
    if(isitpossible(nums,maxOperations,mid)){
ans=mid;
hi=mid-1;
    }else{
lo=mid+1;
    }
}
return ans;
    }
    public static boolean isitpossible(int[] nums,int maxOperations,int mid){
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mid){
                curr+=(nums[i]-1)/mid;
            }

        }
        return curr<=maxOperations;
    }
}