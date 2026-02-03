// Last updated: 2/3/2026, 2:00:49 PM
1class Solution {
2    public int minimizeTheDifference(int[][] mat, int target) {
3
4        int rows = mat.length;
5        Integer[][] memo = new Integer[rows][5001]; 
6        return calc(mat,target, memo,0, 0);
7    }
8
9    public int calc(int[][] mat,int target, Integer[][]memo, int i, int sum) {
10        
11        if (i == mat.length) {
12            return Math.abs(sum - target);
13        }
14
15        if (memo[i][sum] != null) return memo[i][sum];
16
17        int ans = Integer.MAX_VALUE;
18
19        for (int j = 0; j < mat[0].length; j++) {
20            ans = Math.min(ans, calc(mat,target,memo,i + 1, sum + mat[i][j]));
21        }
22        return memo[i][sum] = ans;
23    }
24}
25