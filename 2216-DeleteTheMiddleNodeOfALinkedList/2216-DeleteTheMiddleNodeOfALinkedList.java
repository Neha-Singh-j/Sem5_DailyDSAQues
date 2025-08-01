// Last updated: 8/1/2025, 10:32:52 PM
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
            return new ListNode(fast.val);
        }
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=slow.next;
        return head;
    }
}