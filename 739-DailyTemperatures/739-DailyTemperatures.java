// Last updated: 8/1/2025, 10:35:48 PM
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] ans=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=ans.length-1;i>=0;i--) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=0;
			}else {
				ans[i]=st.peek()-i;
			}
			st.push(i);
		}
        return ans;
    }
}