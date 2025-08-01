// Last updated: 8/1/2025, 10:36:23 PM
class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            for(int j=word.length()-1;j>=0;j--){
                    sb.append(word.charAt(j));
            }
            sb.append(' ');

        }
       sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}