// Last updated: 8/1/2025, 10:33:58 PM
class Solution {
    public List<String> removeAnagrams(String[] words) {
        String[] sorted=new String[words.length];
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
           sorted[i]=sort(words[i]);

        }
        arr.add(words[0]);
         for(int i=1;i<words.length;i++){
          if (!sorted[i].equals(sort(arr.get(arr.size() - 1)))) arr.add(words[i]);
  }
        return arr;
    }
    public static String sort(String s){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}