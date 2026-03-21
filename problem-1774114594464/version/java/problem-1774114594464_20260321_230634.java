// Last updated: 3/21/2026, 11:06:34 PM
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        int t = x;
4        int b = x + k - 1;
5
6        int[][] res = new int[grid.length][grid[0].length];
7        for (int i = 0; i < grid.length; i++) {
8            res[i] = grid[i].clone();
9        }
10
11         while (t < b) {
12            for (int j = y; j < y + k; j++) {
13                int temp = res[t][j];
14                res[t][j] = res[b][j];
15                res[b][j] = temp;
16            }
17            t++;
18            b--;
19        }
20
21        return res;
22    }
23}
24