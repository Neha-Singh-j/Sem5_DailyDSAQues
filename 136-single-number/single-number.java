class Solution {
    public int singleNumber(int[] nums) {
        int i=0,res=0;
        for(i=0;i<nums.length;i++)
        {
            res^=nums[i];
        }
         return res;
    }
}