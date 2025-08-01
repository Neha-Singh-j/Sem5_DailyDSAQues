// Last updated: 8/1/2025, 10:39:33 PM
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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&  fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode h2=reverse(slow.next);
        slow.next=null;
        ListNode h1=head;

        ListNode p1=h1;
        ListNode p2=h2;
        while(p1!=null && p2!=null ){
                ListNode p1nxt=p1.next;
                 ListNode p2nxt=p2.next;
                 p1.next=p2;
                 p2.next=p1nxt;

                 p1=p1nxt;

                 p2=p2nxt;
        }

    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
        ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }
}