// Last updated: 9/25/2025, 9:37:59 AM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                a=a|nums[i];
            }
        }
        return a;
    }
}