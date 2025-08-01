// Last updated: 8/1/2025, 10:37:37 PM
class Solution {
    static int count = 0;

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10; 
        }

        count = 0; 
        boolean[] curr = new boolean[10]; 
        for (int i = 1; i <= 9; i++) {
            curr[i] = true;
            print(n, i + "", curr);
            curr[i] = false;
        }

        return count + 1; // +1 for "0" which is a valid number
    }

    public static void print(int n, String s, boolean[] curr) {
        count++;
        if (s.length() == n) {
            
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (!curr[i]) { 
                curr[i] = true;  
                print(n, s + i, curr); 
                curr[i] = false; // Backtrack
            }
        }
    }
}
