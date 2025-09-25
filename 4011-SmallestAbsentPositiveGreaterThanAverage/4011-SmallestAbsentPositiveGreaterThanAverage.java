// Last updated: 9/25/2025, 9:37:54 AM
class Solution {
    public int smallestAbsent(int[] array) {
        int n = array.length;
        
        double s = 0;
        for (int num : array) {
            s += num;
        }
        double avg = s / n;

        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        int c = (int)Math.floor(avg) + 1;
        if (c <= 0) c = 1; 
        while (set.contains(c)) {
            c++;
        }

        return c;
    }
}
