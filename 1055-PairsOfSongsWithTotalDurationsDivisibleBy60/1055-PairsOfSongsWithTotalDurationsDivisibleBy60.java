// Last updated: 8/1/2025, 10:34:29 PM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int c=0;
        int[] rem=new int[60];
        for(int i=0;i<time.length;i++){
           int r=time[i]%60;
           int comp= (60-r)%60;
            c+=rem[comp];
            rem[r]++;
        }
        return c;
    }
}