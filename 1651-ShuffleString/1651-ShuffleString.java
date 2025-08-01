// Last updated: 8/1/2025, 10:33:34 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
sb.setCharAt(indices[i],s.charAt(i));
        }

        System.out.print(sb);
        return sb.toString();
    }
}