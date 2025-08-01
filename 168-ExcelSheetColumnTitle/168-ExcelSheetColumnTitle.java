// Last updated: 8/1/2025, 10:39:09 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer st=new StringBuffer();
       
   
   while(columnNumber!=0){
    columnNumber--;
        int value=columnNumber%26;
        char letter = (char) ('A' + value); 
        st.append(letter);
        columnNumber=columnNumber/26;
       
   }
   return st.reverse().toString();
    }
}