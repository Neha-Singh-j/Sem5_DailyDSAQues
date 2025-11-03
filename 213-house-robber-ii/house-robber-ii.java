class Solution {
    public int rob(int[] nums) {
         int n=nums.length;
         if(n==1) return nums[0];
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
         int case1 = RobberBU(nums, 0, nums.length - 2,dp1);
        int case2 = RobberBU(nums, 1, nums.length - 1,dp2);

        return Math.max(case1, case2);
       
    }
    public static int RobberBU(int[] nums,int i,int n,int[] dp){
        
        if(i>n) return 0;

        if(dp[i]!=-1) return dp[i];
        
        int dont_rob=RobberBU(nums,i+1,n,dp);
        int rob=nums[i]+RobberBU(nums,i+2,n,dp);
        return dp[i]=Math.max(dont_rob,rob);
    }
}