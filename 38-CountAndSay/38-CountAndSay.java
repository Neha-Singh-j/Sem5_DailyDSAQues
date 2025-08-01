// Last updated: 8/1/2025, 10:41:53 PM
class Solution {
    public String countAndSay(int n) {
        return rle("1", n - 1); // first term is "1", so n-1 iterations
    }

    public static String rle(String s, int n) {
        while (n-- > 0) {
            StringBuilder res = new StringBuilder();
            int count = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    count++;
                } else {
                    res.append(count).append(s.charAt(i - 1));
                    count = 1;
                }
            }
            res.append(count).append(s.charAt(s.length() - 1));
              s = res.toString();
        }
        return s;
    }
}
