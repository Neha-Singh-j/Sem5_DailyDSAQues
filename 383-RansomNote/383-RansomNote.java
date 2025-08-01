// Last updated: 8/1/2025, 10:37:28 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        if(ransomNote.length()>magazine.length()) return false;
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
        }
         for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(freq[c-'a']==0) return false;
            //iterate on ransomNote check every time is it possible to make ransome from magazine,if freq of magazine for current char is 0 then return false
            freq[c-'a']--;
            
         }
         return true;
    }
}