// Last updated: 9/3/2025, 11:35:39 AM
class Solution {
    public int rob(int[] nums) {
        // bottom up------>
        // 2 recursive calls  --forward , backward---what impact on filing table.................
        // rpob house or not --choice 
        int[] dp=new int[nums.length];
        //dp array hold ith index se entire ghr ka robbed amount
        Arrays.fill(dp,-1);

       return robber( nums,nums.length-1,dp);
    }
    public static int robber(int[] arr,int i,int[] dp){
        if(i<0){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        int rob=arr[i]+robber(arr,i-2,dp);
        int Dont_rob=robber(arr,i-1,dp);
        return dp[i]=Math.max(rob,Dont_rob);

    }
}