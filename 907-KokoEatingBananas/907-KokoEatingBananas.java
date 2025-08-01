// Last updated: 8/1/2025, 10:35:22 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int lo=1;
        int hi=piles[piles.length-1];
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(canEat(piles,mid,h)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
  public static boolean canEat(int[] arr, int mid, int k) {
    int n = arr.length;
    int c = 0;
    for (int i = 0; i < n; i++) {
        c += (arr[i] + mid - 1) / mid; 
           if (c > k) return false;
             }
    return c <= k;
}

}