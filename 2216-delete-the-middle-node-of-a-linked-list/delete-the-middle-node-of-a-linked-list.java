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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=null;
        ListNode slow=head;
        ListNode fast=head;
        if(slow.next==null){
            return null;
        }
        if(fast.next.next==null){
            fast.next=null;
            return head;
        }
        while(fast!=null &&  fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=slow.next;
        return head;
    }
}