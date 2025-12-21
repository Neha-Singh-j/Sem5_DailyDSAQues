// Last updated: 12/21/2025, 9:31:50 AM
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        int ans = 1;
4        StringBuilder sb = new StringBuilder(a);
5        while (sb.length() < b.length()) {
6            sb.append(a);
7            ans++;
8        }
9
10        for (int i = 0; i + b.length() <= sb.length(); i++) {
11            if (sb.substring(i, i + b.length()).equals(b)) {
12                return ans;
13            }
14        }
15        // agr out of bound ho rha hai then return nhi hoga append one more time.... 
16        sb.append(a);
17        ans++;
18
19        for (int i = 0; i + b.length() <= sb.length(); i++) {
20            if (sb.substring(i, i + b.length()).equals(b)) {
21                return ans;
22            }
23        }
24
25        return -1; 
26    }
27}
28