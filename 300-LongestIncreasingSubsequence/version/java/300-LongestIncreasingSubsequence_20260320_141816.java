// Last updated: 3/20/2026, 2:18:16 PM
1class Solution {
2    public int lengthOfLIS(int[] arr) {
3        int[] dp=new int[arr.length];
4        Arrays.fill(dp,1);
5        for(int i=1;i<dp.length;i++){
6            for(int j=i-1;j>=0;j--){
7                if(arr[i]>arr[j]){
8                    int x=dp[j];
9                    dp[i]=Math.max(dp[i],x+1);
10                }
11            }
12        }
13        
14        return Arrays.stream(dp).max().getAsInt();
15    }
16}