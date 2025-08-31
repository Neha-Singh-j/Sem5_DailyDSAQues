// Last updated: 8/31/2025, 4:12:38 PM
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int count = 0;
        int i = 0;
        int n = weight.length;

        while (i < n) {
            int currMax = weight[i];
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                currMax = Math.max(currMax, weight[j]);
                if (weight[j] < currMax) {
                    count++;
                    i = j + 1; 
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                break; 
            }
        }

        return count;
    }
}
