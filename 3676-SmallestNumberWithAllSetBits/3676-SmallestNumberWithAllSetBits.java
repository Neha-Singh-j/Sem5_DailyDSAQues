// Last updated: 8/1/2025, 10:31:27 PM
class Solution {
    public int smallestNumber(int n) {
        int num = bin(n);
        boolean flag = true;
        int c = 0;
        while (num > 0) {  // Changed num >= 0 to num > 0 to avoid infinite loop
            int di = num % 10;
            c++;
            if (di != 1) {
                flag = false;
            }
            num /= 10;
        }
        int d = 0;
        while (c > 0) {
            d = d * 10 + 1;
            c--;
        }
        return deci(d);
    }

    public static int bin(int n) {
        int res = 0;
        int mul = 1;
        while (n > 0) {
            int rem = n % 2;  
            res += rem * mul;
            mul *= 10;
            n /= 2;
        }
        return res;
    }

    public static int deci(int n) {
        int res = 0;
        int mul = 1;
        while (n > 0) {
            int rem = n % 10;
            res += rem * mul;
            mul *= 2;  
            n /= 10;
        }
        return res;
    }
}
