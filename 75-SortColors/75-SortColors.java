// Last updated: 8/1/2025, 10:40:58 PM
class Solution {
    public void sortColors(int[] nums){
for(int j=0;j<nums.length;j++){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
            }
        }
        }
    }
}