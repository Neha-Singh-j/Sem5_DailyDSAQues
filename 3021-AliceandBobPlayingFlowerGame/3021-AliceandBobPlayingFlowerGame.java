// Last updated: 8/29/2025, 10:24:49 PM
class Solution {
    public long flowerGame(int n, int m) {
        long oddX = (n + 1) / 2;
        long evenX = n / 2;
        long oddY = (m + 1) / 2;
        long evenY = m / 2;
        // alice winning change when odd number so to get all  possible pairs we hve to  find pairs pair no. =  no. of odd y * even x and vice versa
        return oddX * evenY + evenX * oddY;
    }
}
