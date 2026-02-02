/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        int n = 0;
		ListNode node = head;
		while(node != null) {
				    node = node.next;
				    n++;
		 }
        int[] ans=new int[n];
		Stack<int[]> st=new Stack<>();
        int i=0;
		while(temp!=null){
			while(!st.isEmpty() && temp.val>st.peek()[0]) {
                int[] v=st.pop();
				ans[v[1]]=temp.val;
			}
			st.push(new int[]{temp.val,i});
            i++;
            temp=temp.next;
		}
		while(!st.isEmpty()) {
			ans[st.pop()[1]]=0;
		}
		return ans;
    }
}