// Last updated: 8/1/2025, 10:32:04 PM
class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int lo=0;
        int hi=nums[nums.length-1]-nums[0];

        while(lo<hi){
            int mid=(lo+hi)/2;
            if(isitPossible(nums,mid,p)){
                hi=mid;
            }else{
               lo=mid+1;
            }
        }
        return lo;
    }
    public static boolean isitPossible(int[] nums,int mid,int p){
         int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] <= mid) {
                count++;
                i++; 
            }
        }
        return count >= p;
    }
}