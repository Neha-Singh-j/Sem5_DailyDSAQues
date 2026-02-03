// Last updated: 2/3/2026, 2:01:07 PM
1class Solution {
2    public int largestVariance(String s) {
3        int ans = 0;
4    //tc is 26*26*n 
5        for (char x = 'a'; x <= 'z'; x++) { //constant time loops
6            for (char y = 'a'; y <= 'z'; y++) { //constant time 
7                if (x == y) continue;
8                ans = Math.max(ans, isValidMaxVarience(s, x, y));
9                String rev = new StringBuilder(s).reverse().toString();
10                ans = Math.max(ans, isValidMaxVarience(rev, x, y));
11            }
12        }
13        return ans;
14    }
15
16    private int isValidMaxVarience(String s, char x, char y) {
17        int curr = 0;
18        boolean check = false;
19        int best = 0;
20
21        for (int i = 0; i < s.length(); i++) {
22            char c = s.charAt(i);
23
24            if (c == x) curr++;
25            if (c == y) {
26                curr--;
27                check = true;
28            }
29            if (check) {
30                best = Math.max(best, curr);
31            }
32            if (curr < 0) {
33                curr = 0;
34                check = false;
35            }
36        }
37        return best;
38    }
39}
40