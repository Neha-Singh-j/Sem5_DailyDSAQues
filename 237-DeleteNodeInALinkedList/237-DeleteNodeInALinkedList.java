// Last updated: 8/1/2025, 10:38:16 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       ListNode curr=node; // as we cant access head so we just shifiting all node values one place backside
       curr.val=curr.next.val;
       curr.next=curr.next.next; 
     
    }
}