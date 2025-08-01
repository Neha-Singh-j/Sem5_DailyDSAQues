// Last updated: 8/1/2025, 10:31:01 PM
import java.util.HashSet;

class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {  
             
            for (int j = 0; j < digits.length; j++) {  
                if (i == j) continue;  
                for (int k = 0; k < digits.length; k++) { 
                    if (i == k || j == k) continue; 
                    if (digits[k] % 2 != 0 || digits[i]==0) continue; 

                    int val = digits[i] * 100 + digits[j] * 10 + digits[k];
                    set.add(val);  
                }
            }
        }

        return set.size();
    }
}
