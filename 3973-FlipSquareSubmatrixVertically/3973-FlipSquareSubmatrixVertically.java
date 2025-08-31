// Last updated: 8/31/2025, 4:12:44 PM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int t = x;
        int b = x + k - 1;

        int[][] res = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            res[i] = grid[i].clone();
        }

         while (t < b) {
            for (int j = y; j < y + k; j++) {
                int temp = res[t][j];
                res[t][j] = res[b][j];
                res[b][j] = temp;
            }
            t++;
            b--;
        }

        return res;
    }
}
