// Last updated: 8/1/2025, 10:34:57 PM
class Solution {
    public int minFlipsMonoIncr(String s) {
        int flips = 0, ones = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else {
                // either flip this '0' to '1', or flip previous '1's to '0'
                flips = Math.min(flips + 1, ones);
            }
        }

        return flips;
    }
}
