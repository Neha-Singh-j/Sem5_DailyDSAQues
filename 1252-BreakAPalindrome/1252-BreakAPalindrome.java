// Last updated: 8/1/2025, 10:34:12 PM
class Solution {
    public String breakPalindrome(String s) {
        if (s.length() == 1) return "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return new String(arr);
            }
        }
        arr[s.length() - 1] = 'b';
        return new String(arr);
    }
}
