// Last updated: 9/18/2025, 10:07:35 PM
class Solution {
    public int maxCoins(int[] nums) {
        // very impo...***
    int[] arr=new int[nums.length+2];
        int[][] dp=new int[arr.length][arr.length];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
    arr[0]=1;
    arr[arr.length-1]=1;
    for(int i=0;i<nums.length;i++){
        arr[i+1]=nums[i];
    }
        return maxCoin(arr,0,arr.length-1,dp);
        
    }
    public static int maxCoin(int[] arr, int i, int j,int[][] dp) {
		if(i+1==j) { 
			return 0;
		}
		if(dp[i][j]!=-1){
			return dp[i][j];
		}
		
		int ans=Integer.MIN_VALUE;
		for(int k=i+1;k<j;k++) {
			
			int fs=maxCoin(arr,i,k,dp); 
			int ss=maxCoin(arr,k,j,dp); 
			int self=arr[i]*arr[k]*arr[j];
			ans=Math.max(ans, self+fs+ss);
		}
		return dp[i][j]=ans;
	}

}