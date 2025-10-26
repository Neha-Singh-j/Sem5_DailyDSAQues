// Last updated: 10/26/2025, 10:06:28 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int n=time.length;
        long lo=1;
        long hi=(long) time[n-1]*totalTrips;
        long ans=hi;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(isitPossible(time,mid,totalTrips)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitPossible(int[] arr, long mid, int tt){
        long ct=0;
        for(int a :arr){
                ct+=  mid/a;
            if(ct>=tt) return true;
        }
        return false;
    }
}