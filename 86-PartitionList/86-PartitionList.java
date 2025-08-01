// Last updated: 8/1/2025, 10:40:39 PM
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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(0);
        ListNode curr=head;
        ListNode res=dummy;
        while(curr!=null){
            if(curr.val<x){
                dummy.next=new ListNode(curr.val);
                dummy=dummy.next;
            }
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.val>=x){
                dummy.next=new ListNode(curr.val);
                dummy=dummy.next;
            }
            curr=curr.next;
        }
        return res.next;
    }
}