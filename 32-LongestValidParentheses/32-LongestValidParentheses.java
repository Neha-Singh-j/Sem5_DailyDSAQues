// Last updated: 8/1/2025, 10:42:14 PM
class Solution {
    public int longestValidParentheses(String s) {
      Stack<Integer> st=new Stack();
      int len=0;
        st.push(-1);
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            st.push(i);
        }else{
            st.pop();
            if(st.isEmpty()){
                st.push(i);
            }else{
                len=Math.max(len,i-st.peek());
            }
        }
      }
        return len;
    }
    }