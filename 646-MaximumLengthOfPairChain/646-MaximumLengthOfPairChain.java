// Last updated: 8/1/2025, 10:36:02 PM
class Solution {
    public int findLongestChain(int[][] pairs) {
        int c = 1;
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int[] currP=pairs[0];
        for (int i = 1; i < pairs.length; i++) {
           
            if (pairs[i][0] >currP[1]) {
                c++;
                currP=pairs[i];
            }
        }
        return c;
    }
}