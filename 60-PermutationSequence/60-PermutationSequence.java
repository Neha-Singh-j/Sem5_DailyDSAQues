// Last updated: 8/1/2025, 10:41:13 PM
class Solution {
    public String getPermutation(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        k--; 
        while (n > 0) {
            int fact = factorial(n - 1);
            int index = k / fact;
            sb.append(arr[index]);
             for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            k %= fact;
            n--;
        }
        
        return sb.toString();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
