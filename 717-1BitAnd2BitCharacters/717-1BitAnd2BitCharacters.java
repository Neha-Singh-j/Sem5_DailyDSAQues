// Last updated: 8/1/2025, 10:35:52 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
           
            if (bits[i] == 1) {
                i += 2;
            } else {
                i += 1;
            }
        }
        
        return i == bits.length - 1;
    }
}
