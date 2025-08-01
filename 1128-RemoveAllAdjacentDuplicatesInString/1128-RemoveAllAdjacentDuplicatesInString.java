// Last updated: 8/1/2025, 10:34:22 PM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
                if(!st.isEmpty() ){
                    if(st.peek()!=ch){
                    st.push(ch);
                    }else{
                        st.pop();
                    }
                }else{
                    st.push(ch);
                }

        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
                sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}