// Last updated: 8/1/2025, 10:38:35 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
            if(c>=1){
                return true;
            }
        }
        return false;
    }
}