// Last updated: 8/1/2025, 10:42:33 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int s=0;
        while(curr!=null){
            s++;
            curr=curr.next;
        }
        if(s==n){
            return head.next;
        }
        curr=head;
        int i=1;
        while(i<s-n){
            curr=curr.next;
            i++;
        }
        curr.next=curr.next.next;
        return head;
    }
}