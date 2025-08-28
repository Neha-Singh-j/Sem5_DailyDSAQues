// Last updated: 8/28/2025, 11:21:09 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String key=GetKey(arr[i]);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }
        List<List<String>> ll=new ArrayList<>();
        for(String key: map.keySet()){
            ll.add(map.get(key));
        }
        return ll;
    }
    public static String GetKey(String strs){
         int[] arr = new int[26];
        for (int i = 0; i < strs.length(); i++) {
            char ch=strs.charAt(i);
            arr[ch-'a']++;

        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }
}