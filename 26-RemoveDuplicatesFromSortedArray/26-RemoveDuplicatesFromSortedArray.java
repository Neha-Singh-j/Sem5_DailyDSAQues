// Last updated: 8/1/2025, 10:42:17 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[i-1]){
            nums[j]=nums[i];
            j++;
           }
        }
       
        return j;
    }
}