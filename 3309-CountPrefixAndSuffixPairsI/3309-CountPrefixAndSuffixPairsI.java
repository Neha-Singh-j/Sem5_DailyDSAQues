// Last updated: 8/1/2025, 10:31:47 PM
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                int len=words[i].length();
               int len2=words[j].length();
                if(len<=len2){
                    if(words[j].substring(0,len).equals(words[i]) &&words[j].substring(len2-len,len2).equals(words[i])){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}