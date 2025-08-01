// Last updated: 8/1/2025, 10:38:47 PM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        if(curr==null || curr.next==null){
                    if(curr!=null && curr.val==val){
                    return null;
                    }else{
                        return head;
                    }
        }
        while(curr!=null && curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }else{
            curr=curr.next;
            }
        }
        curr=head;
        if(curr.val==val){
            return curr.next;
        }
        return head;
    }
}