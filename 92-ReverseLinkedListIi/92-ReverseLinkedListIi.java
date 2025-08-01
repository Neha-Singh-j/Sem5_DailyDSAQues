// Last updated: 8/1/2025, 10:40:31 PM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode curr=head;
        ListNode prev=null;
        for(int i=1;i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode leftConnect=prev;
    ListNode tail=curr;
        //revrse ll
        for (int i = 0; i < right - left + 1; i++) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        // connecting reverse part leftconnect to last node------
        if(leftConnect!=null){
            leftConnect.next=prev;
        }else{
            head=prev;
        }
        tail.next=curr;
        return head;
    }
}