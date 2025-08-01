// Last updated: 8/1/2025, 10:41:59 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int lo=0;
        int hi=nums.length-1;

        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                lo=mid+1;
            }else if(nums[mid]>target){
                    hi=mid-1;
            }
        }
        return lo;

    }
}