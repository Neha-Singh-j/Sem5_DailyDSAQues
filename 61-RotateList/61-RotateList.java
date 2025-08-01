// Last updated: 8/1/2025, 10:41:11 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }

        curr.next = head;
        int steps = length - k;
        ListNode newtail = head;
        int i = 1;
        while (i < steps) {
            newtail = newtail.next;
            i++;
        }
        ListNode newhead = newtail.next;
        newtail.next = null;

        return newhead;
    }
}