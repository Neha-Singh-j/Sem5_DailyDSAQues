// Last updated: 8/1/2025, 10:35:45 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> arr=new ArrayList<>();
        for (int i = 0; i < s.length();i++) {
        map.put(s.charAt(i),i);
      }
      int p1=0;
      int p2=0;
      for(int i=0;i<s.length();i++){
       p2=Math.max(p2,map.get(s.charAt(i)));
       if (i == p2) {  
            arr.add(p2- p1 + 1);
                p1 = i + 1;  
            }  
      }
      return arr;
    }
}