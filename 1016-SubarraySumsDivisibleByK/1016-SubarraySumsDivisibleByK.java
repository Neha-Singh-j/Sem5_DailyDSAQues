// Last updated: 8/1/2025, 10:34:36 PM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        return Count_subArray(nums,k);
    }
    public static int Count_subArray(int[] arr,int k) {
		int n=arr.length;
		long[] freq=new long[k];
		long sum=0;
		freq[0]=1;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			int rem=(int) (sum%k);
			if(rem<0) {
				rem+=k; // when rem -ve
			}
			freq[rem]++;
		}
		long ans=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>=2) {
				long x=freq[i];
				ans+=(x*(x-1))/2;
			}
		}
		return (int) ans;
	}

}