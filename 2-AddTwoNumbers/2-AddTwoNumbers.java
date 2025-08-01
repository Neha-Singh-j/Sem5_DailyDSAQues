// Last updated: 8/1/2025, 10:43:09 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            // int val1 = (l1 != null) ? l1.val : 0;
            // int val2 = (l2 != null) ? l2.val : 0;
            int val1,val2;
            if(l1!=null){
                val1=l1.val;
            }else{
                val1=0;
            }
            if(l2!=null){
                val2=l2.val;
            }else{
                val2=0;
            }
            int sum = val1 + val2 + carry;
            
            carry = sum / 10;
            int res = sum % 10;
            current.next = new ListNode(res);
            current = current.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummyHead.next;
    }
}