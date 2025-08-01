// Last updated: 8/1/2025, 10:40:45 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;

        while(curr!=null){
            boolean flag=false;
          while(curr.next!=null && curr.val==curr.next.val){
                 curr=curr.next;
                 flag=true;
            }
            if(!flag){
                 dummy.next=new ListNode(curr.val);
                 dummy=dummy.next;
            }
            curr=curr.next;
        }
          
        
        return res.next;
    }
}