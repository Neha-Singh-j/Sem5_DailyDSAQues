// Last updated: 8/1/2025, 10:36:48 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0, c = 0;
        int j = 0;
        Arrays.sort(g);
         Arrays.sort(s);
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                c += 1;
              i++; 
            }

            j++;
        }

        return c;
    }
}