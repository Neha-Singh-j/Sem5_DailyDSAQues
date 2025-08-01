// Last updated: 8/1/2025, 10:41:20 PM
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        if (intervals.length == 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> arr = new ArrayList<>();
        int[] current = intervals[0];  

        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]) { // Overlapping case
                current = merge(intervals[i], current);
            } else {
                arr.add(current);
                current = intervals[i];  
            }
        }

        arr.add(current);
        int[][] result = new int[arr.size()][2];
        for (int i = 0; i < arr.size(); i++) {
            result[i][0] = arr.get(i)[0];
            result[i][1] = arr.get(i)[1];
        }

        return result;
    
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr = new int[2];
        arr[0] = Math.min(arr2[0],arr1[0]);
        arr[1] = Math.max(arr1[1],arr2[1]); 
        return arr;
    }
}
