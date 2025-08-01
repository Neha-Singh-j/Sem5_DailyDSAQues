// Last updated: 8/1/2025, 10:36:58 PM
import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l11, ListNode l12) {
        ListNode l1 = rev(l11);
        ListNode l2 = rev(l12);
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
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

        return rev(dummyHead.next);
    }

    public static ListNode rev(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        ListNode res = new ListNode(0);
        ListNode temp = res;
        while (!stack.isEmpty()) {
            temp.next = new ListNode(stack.pop());
            temp = temp.next;
        }
        return res.next;
    }
}
