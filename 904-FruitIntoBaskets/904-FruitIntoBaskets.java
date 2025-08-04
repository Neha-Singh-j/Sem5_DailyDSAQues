// Last updated: 8/4/2025, 5:03:29 PM
import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int st = 0;
        int end = 0;
        int c = 0;
        int l = Integer.MIN_VALUE;

        while (end < fruits.length) {
            if (!set.containsKey(fruits[end]) || set.get(fruits[end]) == 0) {
                c++; // new fruit type
            }
            set.put(fruits[end], set.getOrDefault(fruits[end], 0) + 1);

            while (c > 2) {
                set.put(fruits[st], set.get(fruits[st]) - 1);
                if (set.get(fruits[st]) == 0) {
                    c--; // one fruit type removed
                }
                st++;
            }

            l = Math.max(l, end - st + 1);
            end++;
        }

        return l;
    }
}
