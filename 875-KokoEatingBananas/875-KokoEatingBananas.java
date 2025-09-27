// Last updated: 9/27/2025, 3:03:52 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int lo=1;
        int hi=piles[piles.length-1];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitPossible(piles,mid,h)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }

        }
        return ans;
    }
    public static boolean isitPossible(int[] piles, int mid , int h){
        int c=0; // curr houes
        for(int i=0;i<piles.length;i++){
            c+=(piles[i]+mid-1)/mid;
            if(c>h) return false;

        }
        return true;
    }
}