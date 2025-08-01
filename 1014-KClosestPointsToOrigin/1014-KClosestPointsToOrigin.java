// Last updated: 8/1/2025, 10:34:38 PM
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double[] min = new double[points.length];  // Correct type declaration
       
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int x2 = points[i][1];
            min[i] = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));  // Calculate Euclidean distance
        }

        int[][] ans = new int[k][2];
        
        for (int i = 0; i < k; i++) {
            int index = findIndx(min);  // Find the index of the closest point
            ans[i] = points[index];     // Assign that point to the answer array
            min[index] = Double.MAX_VALUE;  // Mark this point as used
        }
        
        return ans;
    }

    public static int findIndx(double[] min) {
        int indx = 0;
        double mini = Double.MAX_VALUE;  // Use double for the minimum value

        for (int n = 0; n < min.length; n++) {
            if (min[n] < mini) {
                mini = min[n];
                indx = n;
            }
        }
        return indx;
    }
}
