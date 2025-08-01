// Last updated: 8/1/2025, 10:42:42 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < s.length()) {
                s = strs[i];
            }
        }

        for(int i=0;i<strs.length;i++){
           
             while (!strs[i].startsWith(s)) {
                s = s.substring(0, s.length() - 1);
                if (s.isEmpty()) return "";
            }
        }
        return s;
    }
}