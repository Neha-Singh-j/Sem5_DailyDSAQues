// Last updated: 11/2/2025, 6:52:39 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int a:asteroids){
             boolean des = false;
            while(!st.isEmpty() && st.peek() > 0 && a < 0){
                if(Math.abs(a)>Math.abs(st.peek())){
                    st.pop();
                }else if(Math.abs(a)==Math.abs(st.peek())){
                    st.pop();
                    des=true;
                    break;
                }else{
                    des=true;
                    break;
                }
            }
            if (!des) {
                st.push(a); // current asteroid survived
            }
        }
        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}

//3 conditions are there 
    //1.current is smaller than top of stack
    //2.current is equal top of stack
    //3.current is bigger than top of stack
