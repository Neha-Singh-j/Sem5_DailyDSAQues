// Last updated: 2/1/2026, 8:05:08 AM
1import java.util.*;
2
3class Solution {
4    public int[] findOriginalArray(int[] changed) {
5        int n = changed.length;
6        if (n % 2 != 0) return new int[0];
7
8        Arrays.sort(changed);
9        boolean[] arr = new boolean[n];
10        int[] curr = new int[n / 2];
11        int idx = 0;
12        int j = 0;
13        for (int i = 0; i < n; i++) {
14            if (arr[i]) continue;
15            j = Math.max(j, i + 1);
16            while (j < n && (arr[j] || changed[j] != changed[i] * 2)) {
17                j++;
18            }
19            if (j == n) return new int[0];
20            arr[i] = true;
21            arr[j] = true;
22            curr[idx++] = changed[i];
23        }
24
25        return curr;
26    }
27}
28