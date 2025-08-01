// Last updated: 8/1/2025, 10:34:26 PM
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
        ListNode temp=head;
        
        ArrayList<Integer> arr=new ArrayList<>();
        while(temp!=null){
           
            arr.add(temp.val);
            temp=temp.next;
        }
       return  nextGreater(arr);

    }
    private static int[] nextGreater(ArrayList<Integer> arr){

        int[] ans=new int[arr.size()];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<ans.length;i++) {
			while(!st.isEmpty() && arr.get(i)>arr.get(st.peek())) {
				ans[st.pop()]=arr.get(i);
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=0;
		}
		return ans;
    }
}