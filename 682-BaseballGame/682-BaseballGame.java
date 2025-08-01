// Last updated: 8/1/2025, 10:35:55 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
    for(int i=0;i<operations.length;i++){
        if(operations[i].equals("C")){
            st.pop();
        }else if(operations[i].equals("D")){
            int num=st.pop();
            st.push(num);
            st.push(num*2);
        }else if(operations[i].equals("+")){
            int n1=st.pop();
            int n2=st.pop();
            st.push(n2);
            st.push(n1);
            st.push(n1+n2);
        }else{
            st.push(Integer.parseInt(operations[i]));
            
        }
    }
    int sum=0;
    while(st.size()!=0){
        sum+=st.pop();
    }
    return sum;
    }
}