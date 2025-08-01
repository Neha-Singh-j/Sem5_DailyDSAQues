// Last updated: 8/1/2025, 10:35:26 PM
class Solution {  
    public String shiftingLetters(String s, int[] shifts) {  
        StringBuilder sb = new StringBuilder(); 
        long sum = 0;  
        for (int i = 0; i < shifts.length; i++) {  
            sum += shifts[i];  
        }
         
        for (int i =0;i<shifts.length;i++) {  
            
              long c=(s.charAt(i)-'a'); 
              c=(c+sum)%26;  
            char ch=(char)(c+'a');
                if(ch>'z'){
                    ch=(char)(ch-26);
                }
                sb.append(ch);
            sum -= shifts[i]; 
            
        }  
        
        return sb.toString(); 
         }  
}