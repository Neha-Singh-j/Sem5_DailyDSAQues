// Last updated: 9/27/2025, 2:17:22 PM
class Solution {

    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        // key:value pair in map is an entry
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        ArrayList<Map.Entry<Character, Integer>> al=new ArrayList<>(map.entrySet());
        al.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<al.size();i++){
           char ch= al.get(i).getKey(); 
            int freq= al.get(i).getValue();
            while(freq-->0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    // private static List<Character> freqSort(String s){

    // }
    // public class pair{
    //     char ch;
    //     int freq;
    //     public class Pair(int frq, char ch){
    //         this.ch=ch;
    //         this.freq=freq;
    //     }
    // }

}