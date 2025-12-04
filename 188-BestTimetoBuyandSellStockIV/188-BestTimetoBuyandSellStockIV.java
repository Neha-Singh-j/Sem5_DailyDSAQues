// Last updated: 12/4/2025, 9:35:45 AM
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3        int[][] dp=new int[prices.length][2*k];
4        for(int[]d:dp){
5            Arrays.fill(d,-1);
6        }
7       return find(0,0,k,prices,dp);
8    }
9    // one operations --> 1 buy then 1 sell
10    public static int find(int i, int op,int k, int[]prices,int[][]dp){
11        if(i==prices.length) return 0; // cant perform more operations
12        if(op==2*k) return 0; // all operations done
13        if(dp[i][op]!=-1) return dp[i][op];
14        int profit=0;
15        if(op%2==0) { // you can buy new
16            //two choices buy or not buy
17            int buy=-prices[i]+find(i+1,op+1,k,prices,dp);
18            int not_buy=find(i+1,op,k,prices,dp);
19            profit=Math.max(buy,not_buy);
20        }else{
21            int sell=prices[i]+find(i+1,op+1,k,prices,dp);
22            int not_sell=find(i+1,op,k,prices,dp);
23            profit=Math.max(sell,not_sell);
24        }
25        return dp[i][op]=profit;
26    }
27}