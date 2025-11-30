// Last updated: 11/30/2025, 8:36:43 AM
1class Solution {
2    public int countElements(int[] nums, int k) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int c=0;
6        for(int i=0;i<n;){
7            int curr=nums[i];
8            int j=i;
9            while(j<n && nums[j]==curr) j++;
10                int freq=j-i;
11                int val=n-j;
12                if(val>=k){
13                    c+=freq;
14                }
15            i=j;
16        }
17        return c;
18    }
19}