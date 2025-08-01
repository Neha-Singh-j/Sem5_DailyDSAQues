// Last updated: 8/1/2025, 10:34:32 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
       int st=0;
       int end=0;
       int c=0;
       int max=Integer.MIN_VALUE;
       while(end<nums.length){
        if (nums[end] == 0) {
                c++;
            }
            while (c > k) {
                if (nums[st] == 0) {
                    c--;
                }
                st++;
            }
            max = Math.max(max, end- st+1);
            end++;
       }
        return max;
       }
    }
