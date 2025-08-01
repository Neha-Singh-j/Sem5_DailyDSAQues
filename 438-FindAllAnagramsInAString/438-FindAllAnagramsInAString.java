// Last updated: 8/1/2025, 10:37:03 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int n=p.length();
       int m=s.length();
       ArrayList<Integer> arr=new ArrayList<>();
       int[] sfreq=new int[26];
       int [] pfreq=new int[26];
       if(m<n) return arr;
       
       for(int i=0;i<n;i++){
        pfreq[p.charAt(i)-'a']++;
         sfreq[s.charAt(i)-'a']++;
       }
       
       for(int i=0;i<=s.length()-n;i++){
        if(i>0){
            sfreq[s.charAt(i-1)-'a']--;
            sfreq[s.charAt(i+n-1)-'a']++;
        }
            if(isAnagram(pfreq,sfreq)){
                arr.add(i);
            }
       }
       return arr; 
     }
    private boolean isAnagram(int[] pFreq, int[] sFreq) {
        for (int i = 0; i < 26; i++) {
            if (pFreq[i] != sFreq[i]) return false;
        }
        return true;
    }
}