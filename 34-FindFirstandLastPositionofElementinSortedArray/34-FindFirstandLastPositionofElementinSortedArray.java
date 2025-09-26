// Last updated: 9/26/2025, 9:11:45 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int l=binarySearch(nums,target,true);
        int r=binarySearch(nums,target,false);
        arr[0]=l;
        arr[1]=r;
        return arr;
    }
    public static int binarySearch(int[] nums, int target, boolean searchLeft){
        int l=0;
        int r=nums.length-1;
        int i=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                i=mid;
                if(searchLeft){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return i;
    }
}