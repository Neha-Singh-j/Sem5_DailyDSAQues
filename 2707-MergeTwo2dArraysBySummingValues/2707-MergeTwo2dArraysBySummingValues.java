// Last updated: 10/26/2025, 10:05:36 PM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        List<int[]> result = new ArrayList<>();
         while (i < n && j < m) {
            if (nums1[i][0] == nums2[j][0]) { 
                int id = nums1[i][0];
                int value = nums1[i][1] + nums2[j][1];
                int[] temp = new int[2];
                temp[0] = id;
                temp[1] = value;

                result.add(temp);

                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                result.add(nums1[i]);
                i++;
            } else {
                result.add(nums2[j]);
                j++;
            }
        }
         while (i < n) {
            result.add(nums1[i]);
            i++;
        }
        while (j < m) {
            result.add(nums2[j]);
            j++;
        }

        int[][] arr = new int[result.size()][2]; 
        for ( i = 0; i < result.size(); i++) {
            int[] row = result.get(i);
            arr[i][0] = row[0]; 
            arr[i][1] = row[1]; 
        }
        return arr;
    }
}
