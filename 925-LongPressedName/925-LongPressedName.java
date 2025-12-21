// Last updated: 12/21/2025, 6:40:10 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int p1 = 0, p2 = 0;
4        while (p2 < typed.length()) {
5            if (p1 < name.length() && name.charAt(p1) == typed.charAt(p2)) {
6                p1++;
7                p2++;
8            } else if (p2 > 0 && typed.charAt(p2) == typed.charAt(p2 - 1)) {
9                // Long press character
10                p2++;
11            } else {
12                return false;
13            }
14        }
15        return p1 == name.length();
16    }
17}
18