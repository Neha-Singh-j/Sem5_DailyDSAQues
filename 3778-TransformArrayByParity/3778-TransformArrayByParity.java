// Last updated: 8/1/2025, 10:31:06 PM
class Solution {
    public int[] transformArray(int[] nums) {
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2!=0){
                nums[j]=1;
            }else{
                nums[j]=0;
            }
        }
         Arrays.sort(nums);
        return nums;
    }
}