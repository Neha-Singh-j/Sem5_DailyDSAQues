// Last updated: 2/19/2026, 8:44:04 PM
1class Solution {
2    public String maxValue(String n, int x) {
3        String ans = "";
4        char chx = (char)(x + '0');
5        if (n.charAt(0) == '-') {
6            for (int i = 1; i < n.length(); i++) {
7                int ch = n.charAt(i) - '0';
8
9                if (ch > x) {  
10                    return n.substring(0, i) + chx + n.substring(i);
11                }
12            }
13            return n + chx;
14
15        } else {
16            for (int i = 0; i < n.length(); i++) {
17                int ch = n.charAt(i) - '0';
18
19                if (ch < x) {
20                    return n.substring(0, i) + chx + n.substring(i);
21                }
22            }
23            return n + chx;
24        }
25    }
26}