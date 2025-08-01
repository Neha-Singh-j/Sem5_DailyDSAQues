// Last updated: 8/1/2025, 10:35:36 PM
class Solution {
    public String customSortString(String order, String s) {
      StringBuilder sb=new StringBuilder();
        Set<Character> set=new HashSet();
        int[] arr=new int[26];
        for(char i: order.toCharArray()){
            set.add(i);
        }
        for(char i: s.toCharArray()){
            if(!set.contains(i)){
                sb.append(i);
            }else{
                arr[i-'a']++;
            }
        }
        for(char i:order.toCharArray()){
            while(arr[i-'a']!=0){
                sb.append(i);
                arr[i-'a']--;
            }
        }
        return sb.toString();

    }
}