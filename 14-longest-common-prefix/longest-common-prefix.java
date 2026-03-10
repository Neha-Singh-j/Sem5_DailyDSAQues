class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st=strs[0];
        String end=strs[strs.length-1];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.length();i++){
            char ch1=st.charAt(i);
            char ch2=end.charAt(i);
            if(ch1==ch2){
                sb.append(ch1);
            }else{
                break;
            }
        }
        return sb.toString();
    }
}