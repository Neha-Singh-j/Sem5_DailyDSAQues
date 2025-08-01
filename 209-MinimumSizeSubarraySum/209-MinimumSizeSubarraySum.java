// Last updated: 8/1/2025, 10:38:41 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st=0;
        int end=0;
        int sum=0;
        int len=Integer.MAX_VALUE;
        while(end<nums.length){
            sum+=nums[end];
            while(sum>=target){
                if(end-st+1<len){
                    len=end-st+1;
                }
                sum-=nums[st];
                st++;
            }
            end++;
        }
        if(len!=Integer.MAX_VALUE){
            return len;
        }else{
            return 0;
        }
    }
}