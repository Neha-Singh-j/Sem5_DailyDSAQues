// Last updated: 11/25/2025, 3:06:53 PM
class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int n = 1;
        int c = 1;
        while (n % k != 0) {
            n = (n * 10 + 1) % k;
            c++;

        }
        return c;
    }
}