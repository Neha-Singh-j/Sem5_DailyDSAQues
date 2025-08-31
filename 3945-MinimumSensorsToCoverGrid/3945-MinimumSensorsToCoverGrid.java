// Last updated: 8/31/2025, 4:12:47 PM
class Solution {
    public int minSensors(int n, int m, int k) {
          int s = 2 * k + 1;                 
        int r = (n + s - 1) / s;       
        int c = (m + s - 1) / s;       
        return r*c;
    }
}