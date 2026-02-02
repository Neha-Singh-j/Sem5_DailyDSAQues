// Last updated: 2/2/2026, 10:25:25 AM
1class Solution {
2    public int maximumLength(String s) {
3        HashMap<Character, List<Integer>> map = new HashMap<>();
4        int n = s.length();
5        int i = 0;
6        while (i < n) {
7            int currp = 1;
8            char ch = s.charAt(i);
9            while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
10                currp ++;
11                i ++;
12            }
13            map.computeIfAbsent(ch, k -> new ArrayList<>()).add(currp);
14            i ++;
15        }
16
17        int maxi = -1;
18        for (List<Integer> lis : map.values()) {
19            lis.sort(Collections.reverseOrder());
20            
21            if (lis.get(0) >= 3) {
22                maxi = Math.max(maxi, lis.get(0) - 2);
23            }
24            
25            if (lis.size() >= 2) {
26                if (lis.get(0) >= 2) {
27                    maxi = Math.max(maxi, Math.min(lis.get(0) - 1, lis.get(1)));
28                }
29                if (lis.size() >= 3) {
30                    maxi = Math.max(maxi, Math.min(lis.get(0), Math.min(lis.get(1), lis.get(2))));
31                }
32            }
33        }
34
35        return maxi;
36    }
37}