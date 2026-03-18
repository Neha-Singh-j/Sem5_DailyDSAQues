// Last updated: 3/18/2026, 11:19:58 PM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        
6        if (intervals.length == 0) return new int[0][];
7        if (intervals.length == 1) return intervals;
8
9        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
10
11        List<int[]> arr = new ArrayList<>();
12        int[] current = intervals[0];  
13
14        for (int i = 1; i < intervals.length; i++) {
15            if (current[1] >= intervals[i][0]) { // Overlapping case
16                current = merge(intervals[i], current);
17            } else {
18                arr.add(current);
19                current = intervals[i];  
20            }
21        }
22
23        arr.add(current);
24        int[][] result = new int[arr.size()][2];
25        for (int i = 0; i < arr.size(); i++) {
26            result[i][0] = arr.get(i)[0];
27            result[i][1] = arr.get(i)[1];
28        }
29
30        return result;
31    
32    }
33
34    public static int[] merge(int[] arr1, int[] arr2) {
35        int[] arr = new int[2];
36        arr[0] = Math.min(arr2[0],arr1[0]);
37        arr[1] = Math.max(arr1[1],arr2[1]); 
38        return arr;
39    }
40}
41