// Last updated: 8/1/2025, 10:34:06 PM
class Solution {
    public String makeFancyString(String s) {
       StringBuilder sb = new StringBuilder();
       sb.append(s.charAt(0));
            int c = 1;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
          if(ch==s.charAt(i-1)){
            c++;
          }else{
            c=1;
          }
            if (c <= 2) {
                sb.append(ch);
               
            }
        }
        return sb.toString();
    }
}
