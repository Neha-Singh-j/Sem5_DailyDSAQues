// Last updated: 8/1/2025, 10:43:01 PM
class Solution {
    int start = 0;
    int end = 0;

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        solve(s.toCharArray(), 0);
        return s.substring(start, end + 1);
    }

    public void solve(char[] s, int index) {
        if (index >= s.length - 1) {
            return;
        }

        int left = index;
        int right = index;

        while (right < s.length - 1 && s[right] == s[right + 1]) {
            right++;
        }
        index = right;

        while (left > 0 && right < s.length - 1 && s[left - 1] == s[right + 1]) {
            left--;
            right++;
        }

        if (end - start < right - left) {
            start = left;
            end = right;
        }
        solve(s, index + 1);
    }

}