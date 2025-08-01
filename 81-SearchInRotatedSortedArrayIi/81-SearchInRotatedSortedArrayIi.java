// Last updated: 8/1/2025, 10:40:47 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        int n=nums.length;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return true;
            }
            if (nums[lo] == nums[mid] && nums[mid] == nums[hi]) {
                lo++;
                hi--;
                continue;
            }
            if(nums[lo]<=nums[mid]){
                if(nums[lo]<=target && target<=nums[mid]){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[hi]){
                    
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
        }
        return false;
    }
}