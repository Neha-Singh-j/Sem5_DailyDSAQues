// Last updated: 11/27/2025, 12:04:06 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int i=0,res=0;
4        for(i=0;i<nums.length;i++)
5        {
6            res^=nums[i];
7        }
8         return res;
9    }
10}