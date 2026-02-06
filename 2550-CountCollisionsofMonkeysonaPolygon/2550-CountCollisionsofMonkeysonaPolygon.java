// Last updated: 2/6/2026, 9:39:56 PM
1class Solution {
2     long MOD = 1_000_000_007;
3    public int monkeyMove(int n) {
4        long ans = pow(2, n);
5        return (int)((ans - 2 + MOD) % MOD);
6    }
7
8    private long pow(long base, long exp) {
9        long res = 1;
10        while (exp > 0) {
11            if ((exp & 1) == 1) {
12                res = (res * base) % MOD;
13            }
14            base = (base * base) % MOD;
15            exp >>= 1;
16        }
17        return res;
18    }
19}
20