// Last updated: 8/1/2025, 10:33:24 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     String w1=String.join("", word1);  
      String w2=String.join("", word2);
      if(w1.length()!=w2.length()) return false;
     for(int i=0;i<w1.length();i++){
        if(w1.charAt(i)!=w2.charAt(i)) return false;
     }
      return true;
    }
}