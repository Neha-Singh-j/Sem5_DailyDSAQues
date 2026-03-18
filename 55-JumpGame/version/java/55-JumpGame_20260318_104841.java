// Last updated: 3/18/2026, 10:48:41 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n=nums.length;
4        int maxReach=0;
5        for(int i=0;i<n;i++){
6            if(i>maxReach){
7                return false;
8            }
9            maxReach=Math.max(maxReach,i+nums[i]);
10            if(maxReach>=n-1){
11                return true;
12            }
13        }
14        return true;
15    }
16}