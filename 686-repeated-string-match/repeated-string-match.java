class Solution {
    public int repeatedStringMatch(String a, String b) {
        int ans = 1;
        StringBuilder sb = new StringBuilder(a);
        while (sb.length() < b.length()) {
            sb.append(a);
            ans++;
        }

        for (int i = 0; i + b.length() <= sb.length(); i++) {
            if (sb.substring(i, i + b.length()).equals(b)) {
                return ans;
            }
        }
        // agr out of bound ho rha hai then return nhi hoga append one more time.... 
        sb.append(a);
        ans++;

        for (int i = 0; i + b.length() <= sb.length(); i++) {
            if (sb.substring(i, i + b.length()).equals(b)) {
                return ans;
            }
        }

        return -1; 
    }
}
