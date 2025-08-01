// Last updated: 8/1/2025, 10:30:49 PM
class Solution {
    public String resultingString(String s) {
        StringBuilder st = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = st.length();
            if (len > 0 && areConsecutive(st.charAt(len - 1), c)) {
                st.deleteCharAt(len - 1);  // Remove the last character
            } else {
                st.append(c);
            }
        }

        return st.toString();
    }

    private boolean areConsecutive(char a, char b) {
        return Math.abs(a - b) == 1 || (a == 'a' && b == 'z') || (a == 'z' && b == 'a');
    }
}
