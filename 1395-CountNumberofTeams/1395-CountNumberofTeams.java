// Last updated: 1/20/2026, 10:38:06 AM
1class Solution {
2    public int numTeams(int[] rating) {
3        int res = 0;
4        for (int i = 0; i < rating.length - 2; i++) {
5            for (int j = i + 1; j < rating.length - 1; j++) {
6                for (int k = j + 1; k < rating.length; k++) {
7                    if ((rating[i] < rating[j] && rating[j] < rating[k]) || (rating[i] > rating[j] && rating[j] > rating[k])) {
8                        res++;
9                    }
10                }
11            }
12        }
13        return res;
14    }
15}