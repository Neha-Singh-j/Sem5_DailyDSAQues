// Last updated: 11/29/2025, 2:39:55 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int Tsum=0;
4        for(int n:nums){
5            Tsum+=n;
6        }
7        int res=Tsum%k;
8        return res;
9    }
10}