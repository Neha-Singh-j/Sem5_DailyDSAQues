// Last updated: 10/26/2025, 10:06:37 PM
class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return gcd(min, max);
    }
    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}