// Last updated: 8/1/2025, 10:41:00 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        int i = 0;
        while (i < m) {
            if (matrix[i][0] <= target && target <= matrix[i][n - 1]) {
                int lo = 0;
                int hi = n - 1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (matrix[i][mid] < target) {
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }

            }
            i++;
        }
        return false;

    }

}
