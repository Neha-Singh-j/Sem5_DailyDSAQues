// Last updated: 8/1/2025, 10:34:03 PM
class Solution {
    public int maximumCandies(int[] candies, long k) {
    Arrays.sort(candies);
    int n=candies.length;
        long sum=0;
        for(int i=0;i<candies.length;i++){
            sum+=candies[i];
        }
        if(sum<k) return 0;

        int lo=1;
        int hi=candies[n-1];
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(canDivide(candies,mid,k)){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
    }
  public static boolean canDivide(int[] arr, int mid, long k) {
    int n = arr.length;
    long c = 0;
    for (int i = 0; i < n; i++) {
        c +=arr[i] / mid;
           if (c >= k) return true;
             }
    return false;
}

}