// Last updated: 8/1/2025, 10:31:14 PM
class Solution {
    public String findValidPair(String s) {
        int[] frq = new int[10];

        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - '0']++;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int c1 = s.charAt(i) - '0';
            int c2 = s.charAt(i + 1) - '0';
            if (c1 != c2 && frq[c1] == c1 && frq[c2] == c2) {
                return s.substring(i, i + 2);
            }
        }

        return "";
    }
}
