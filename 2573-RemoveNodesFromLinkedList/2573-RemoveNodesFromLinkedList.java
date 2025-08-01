// Last updated: 8/1/2025, 10:32:20 PM
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        // Traverse and push onto stack
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        Stack<Integer> result = new Stack<>();
        int max = Integer.MIN_VALUE;

        // Traverse from end (via stack) and filter
        while (!stack.isEmpty()) {
            int val = stack.pop();
            if (val >= max) {
                result.push(val);
                max = val;
            }
        }

        // Build result linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!result.isEmpty()) {
            curr.next = new ListNode(result.pop());
            curr = curr.next;
        }

        return dummy.next;
    }
}
