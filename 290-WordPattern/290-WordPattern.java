// Last updated: 8/2/2025, 3:26:25 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1=new HashMap<Character,String>();
        HashSet<String> used = new HashSet<>();
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(!map1.containsKey(ch)){
              if (used.contains(arr[i])) return false; 
                   map1.put(ch, arr[i]);
                used.add(arr[i]);
            }else{
                if (!map1.get(ch).equals(arr[i])) return false;
            }
        }
        return true;
    }
}