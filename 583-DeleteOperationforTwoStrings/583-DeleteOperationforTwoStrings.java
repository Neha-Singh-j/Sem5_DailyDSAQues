// Last updated: 12/21/2025, 9:32:22 AM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] dp=new int[word1.length()][word2.length()];
4        for(int[] d: dp){
5            Arrays.fill(d,-1);
6        }
7        return Min_Ops(word1, word2, 0, 0,dp);
8
9    }
10
11    public static int Min_Ops(String s, String t, int i, int j,int[][] dp) {
12        if (i == s.length()) {
13            return t.length() - j;
14
15        }
16        if (j == t.length()) {
17            return s.length() - i;
18
19        }
20        if(dp[i][j]!=-1) return dp[i][j];
21        int ans = 0;
22        if (s.charAt(i) == t.charAt(j)) {
23            return Min_Ops(s, t, i + 1, j + 1,dp);
24        }
25
26        int D1 = Min_Ops(s, t, i + 1, j,dp);
27        int D2 = Min_Ops(s, t, i, j + 1,dp);
28        return dp[i][j]=1 + Math.min(D1, D2);
29    }
30}