// Last updated: 12/21/2025, 9:32:43 AM
1class Solution {
2     int hour = -1;
3    int minute = -1;
4    public String largestTimeFromDigits(int[] arr) {
5        boolean used[] =new boolean[4];
6        int[] res=new int[4];
7        backtrack(arr,used,res,0);
8        if (hour == -1) return "";
9        return String.format("%02d:%02d", hour, minute);
10    }
11    private  void backtrack(int[] digits, boolean[] used, int[] res, int idx) {
12        if (idx == 4) {
13            int hr = res[0] * 10 + res[1];
14            int min = res[2] * 10 + res[3];
15
16            if (hr < 24 && min < 60) {
17                if (hr > hour || (hr == hour && min > minute)) {
18                    hour = hr;
19                    minute = min;
20                }
21            }
22            return;
23        }
24
25        for (int i = 0; i < 4; i++) {
26            if (!used[i]) {
27                used[i] = true;
28                res[idx] = digits[i];
29                backtrack(digits, used, res, idx + 1);
30                used[i] = false; // backtrack
31            }
32        }
33    }
34}