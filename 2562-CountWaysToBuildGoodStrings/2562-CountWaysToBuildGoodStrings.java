// Last updated: 10/26/2025, 10:06:13 PM
class Solution {
    static final int MOD = 1_000_000_007;
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp=new int[high+1];
        Arrays.fill(dp,-1);
        return rec(low,high,zero,one,0,dp);
    }
    public static int rec(int lo,int hi,int z,int o,int curr, int[] dp){

        if(curr<0 || curr>hi) return 0;
        int c=0;
        if(dp[curr]!=-1) return dp[curr];
        if(curr>=lo && curr<=hi){
            c=1;
        }

       c+= rec(lo,hi,z,o,curr+o,dp);
       c=c%MOD;
       c+= rec(lo,hi,z,o,curr+z,dp);
        c=c%MOD;
        return dp[curr]=(int) c;
    }
}