// Last updated: 8/1/2025, 10:35:01 PM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> li=new ArrayList<>();
        int[] maxc=new int[26];
        for(String word :words2){
            int[] freq=new int[26];
           
            for(char ch: word.toCharArray()){
                freq[ch-'a']++;
            }
             for(int k=0;k<26;k++){
            maxc[k]=Math.max(maxc[k],freq[k]);
             }
        }
        for(String word: words1){
            int[] freq=new int[26];
                      for(char ch:word.toCharArray()){
                freq[ch-'a']++;
            }
            boolean state=true;
        for(int k=0;k<26;k++){
            if(freq[k]<maxc[k]){
                state=false;
                break;
            }
}

        if(state){
        li.add(word);
        }
        }
return li;
    }
}