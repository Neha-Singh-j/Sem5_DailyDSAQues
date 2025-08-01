// Last updated: 8/1/2025, 10:36:20 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] frq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            frq[s1.charAt(i) - 'a']++;
        }

        int p1 = 0;
        int p2 = s1.length() - 1;
        while (p2 < s2.length()) {
            if (check(s2.substring(p1, p2 + 1), frq)) {
                return true;
            }
            p1++;
            p2++;
        }

        return false;
    }

    public static boolean check(String s2, int[] frq) {
        int[] f2 = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            f2[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) { 
            if (f2[i] != frq[i]) return false;
        }
        return true;
    }
}
