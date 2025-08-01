// Last updated: 8/1/2025, 10:33:55 PM
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
           char ch= s.charAt(i);
            if(ch=='('){
                sb.append(ch);
                st.push(i);
            }else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                    sb.append(ch);
                }
            }else{
                sb.append(ch);
            }
            // System.out.println(sb);
        }
        while(!st.isEmpty()){
            int indx=st.pop();
            char ch =s.charAt(indx);
            int i=sb.length()-1;
            while(sb.charAt(i)!=ch){
                i--;
            }
            sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}