// Last updated: 8/1/2025, 10:31:39 PM
class Solution {
    public String compressedString(String word) {
        int c = 1;
        int n = word.length();
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                c++;
            } else {
                if (c > 9) {
                    while (c > 9) {
                        s.append(9).append(word.charAt(i - 1));
                        c -= 9;
                    }
                    s.append(c).append(word.charAt(i - 1));
                } else {
                    s.append(c).append(word.charAt(i - 1));
                }
                c = 1;
            }
        }
        if (c > 9) {
            while (c > 9) {
                s.append(9).append(word.charAt(n - 1));
                c -= 9;
            }
            s.append(c).append(word.charAt(n - 1));
        } else {
            s.append(c).append(word.charAt(n - 1));
        }
        return s.toString();
    }
}