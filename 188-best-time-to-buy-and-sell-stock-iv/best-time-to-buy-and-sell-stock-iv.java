class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][] dp=new int[prices.length][2*k];
        for(int[]d:dp){
            Arrays.fill(d,-1);
        }
       return find(0,0,k,prices,dp);
    }
    // one operations --> 1 buy then 1 sell
    public static int find(int i, int op,int k, int[]prices,int[][]dp){
        if(i==prices.length) return 0; // cant perform more operations
        if(op==2*k) return 0; // all operations done
        if(dp[i][op]!=-1) return dp[i][op];
        int profit=0;
        if(op%2==0) { // you can buy new
            //two choices buy or not buy
            int buy=-prices[i]+find(i+1,op+1,k,prices,dp);
            int not_buy=find(i+1,op,k,prices,dp);
            profit=Math.max(buy,not_buy);
        }else{
            int sell=prices[i]+find(i+1,op+1,k,prices,dp);
            int not_sell=find(i+1,op,k,prices,dp);
            profit=Math.max(sell,not_sell);
        }
        return dp[i][op]=profit;
    }
}