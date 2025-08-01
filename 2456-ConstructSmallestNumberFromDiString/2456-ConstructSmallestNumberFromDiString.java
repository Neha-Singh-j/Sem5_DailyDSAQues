// Last updated: 8/1/2025, 10:32:37 PM
class Solution {
    public static String smallestNumber(String pattern) {
		    int[] arr=new int[pattern.length()+1];
		    int c=1;
		    Stack<Integer> st=new Stack<>();
		        for(int i=0;i<=pattern.length();i++){
		            if(pattern.length()==i||pattern.charAt(i)=='I'){
		            	arr[i]=c;
		            	c++;
		            	while(!st.isEmpty()) {
		            		arr[st.pop()]=c;
		            		c++;
		            	}
		            }else{
		            	st.push(i);
		            }
		        }
		        String s="";
		        for(int i:arr) {
		        	s=s+i;
		        }
		        return s;
		    }
}