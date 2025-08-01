// Last updated: 8/1/2025, 10:40:56 PM
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tmap = new HashMap<>(); // for storing freq of t string characters
        HashMap<Character, Integer> map = new HashMap<>();

         for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        int start = 0;
        int st = 0;
        int matched = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (tmap.containsKey(ch) && map.get(ch).intValue() <= tmap.get(ch).intValue()) {
                matched++;
            }

            // When all characters are matched
            while (matched == t.length()) {
                if (end - st + 1 < min) {
                    min = end - st + 1;
                    start = st;
                }

                // Shrink from left
                char out = s.charAt(st);
                map.put(out, map.get(out) - 1);
                if (tmap.containsKey(out) && map.get(out) < tmap.get(out)) {
                    matched--;
                }
                st++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}
