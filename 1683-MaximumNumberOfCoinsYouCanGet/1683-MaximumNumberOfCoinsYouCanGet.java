// Last updated: 8/1/2025, 10:33:31 PM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int l=0;
        int r=piles.length-1;
        int me=r-1;
        int sum=0;
        while(l<r){
            sum+=piles[me];
           
            l++;
           
             r-=2;
              me=r-1;
        }
        return sum;
    }
}