// Last updated: 8/1/2025, 10:38:42 PM
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
    public ListNode reverseList(ListNode head) {
       ListNode curr=head; // mainly tracking
       ListNode prev=null;
       while(curr!=null){
            ListNode nn=curr.next; // as we are going to change curr.next to prev so we have to save next one bcz after that we could increament our curr to next node nn
            curr.next=prev; /// reverse connections
            prev=curr; // just shifting one unit ahead all 3 nodes
            curr=nn;

       } 
        return prev;// this handles head in actual;
    }
}