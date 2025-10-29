class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int len = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; 
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++; 
                if (isBalanced(freq)) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    private boolean isBalanced(int[] freq) {
        int c = -1;
        for (int f : freq) {
            if (f > 0) {
                if (c == -1) c = f;
                else if (f != c) return false;
            }
        }
        return true;
    }
}
