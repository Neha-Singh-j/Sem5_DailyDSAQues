// Last updated: 8/1/2025, 10:39:30 PM
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
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null) return  head;
        ListNode middleNode= middle(head);
        ListNode right=middleNode.next;
        middleNode.next=null;
        ListNode left = head;
        left = sortList(left);
        right= sortList(right);
        return MergeList(left,right);
    }
    public ListNode middle(ListNode head ){
        // if(head==null || head.next == null) return head;
        ListNode slow=head ;
        ListNode fast=head ;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode MergeList(ListNode head1, ListNode head2){
    if(head1==null || head2 == null) return null;

        ListNode head = new ListNode (-1);
        ListNode temp = head ;
        while(head1!=null && head2 !=null){
            if(head1.val<head2.val){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        if(head1!=null){
            temp.next=head1;
        }
        if(head2!=null){
            temp.next=head2;
        }
        return head.next;
    }
}