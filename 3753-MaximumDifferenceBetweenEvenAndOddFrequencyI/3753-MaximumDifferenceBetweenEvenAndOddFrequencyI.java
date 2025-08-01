// Last updated: 8/1/2025, 10:31:09 PM
class Solution {
    public int maxDifference(String s) {
        int[] frq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
        }

        int maxodd = Integer.MIN_VALUE;
        int mineven = Integer.MAX_VALUE;
        boolean hasEven = false, hasOdd = false;

        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > 0) { 
                if (frq[i] % 2 != 0) {
                    maxodd = Math.max(frq[i], maxodd);
                    hasOdd = true;
                } else {
                    mineven = Math.min(frq[i], mineven);
                    hasEven = true;
                }
            }
        }

        if (!hasOdd || !hasEven) {
            return -1;
        }

        return maxodd - mineven;
    }
}
