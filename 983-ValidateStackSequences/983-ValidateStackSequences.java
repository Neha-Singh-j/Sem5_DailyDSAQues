// Last updated: 8/1/2025, 10:34:46 PM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=0; // iterate over push
        int j=0; //indx of pop
       while(i<pushed.length){
        st.push(pushed[i]);
        i++;
        while(!st.isEmpty() && popped[j]==st.peek()){
            st.pop();
            j++;
        }
       }
       if(st.isEmpty()){
        return true;
       }
       return false;

    }
}