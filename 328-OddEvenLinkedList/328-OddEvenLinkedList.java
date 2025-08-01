// Last updated: 8/1/2025, 10:37:51 PM
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
    public ListNode oddEvenList(ListNode head) {
        ListNode res=new ListNode(0);
        ListNode dummy=res;
        ListNode curr=head;
        int indx=1;
        while(curr!=null){
            if(indx%2!=0){
                dummy.next=new ListNode(curr.val);
                dummy=dummy.next;
            }
            indx++;
                curr=curr.next;
        }
        indx=1;
        curr=head;
         while(curr!=null){
            if(indx%2==0){
                dummy.next=new ListNode(curr.val);
                dummy=dummy.next;
            }
            indx++;
                curr=curr.next;
        }
    return res.next;
    }
}