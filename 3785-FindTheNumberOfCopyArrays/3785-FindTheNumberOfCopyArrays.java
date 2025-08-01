// Last updated: 8/1/2025, 10:31:04 PM
class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int n = original.length;
       long l = bounds[0][0];
        long u = bounds[0][1];

        for (int i = 1; i < n; i++) {
            int diff = original[i] - original[i - 1];
            l += diff;
            u += diff;
            l = Math.max(l, bounds[i][0]);
            u = Math.min(u, bounds[i][1]);
            if (l > u) {
                return 0;
            }
        }
         return (int) (u - l + 1);
    }
}