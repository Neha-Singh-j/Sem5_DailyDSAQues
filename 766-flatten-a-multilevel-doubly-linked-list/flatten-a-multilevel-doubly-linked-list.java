class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;

        Node curr = head;

        while (curr != null) {

            // If current node has a child
            if (curr.child != null) {

                Node next = curr.next;
                Node child = curr.child;

                // Attach child to next
                curr.next = child;
                child.prev = curr;

                // Find tail of child list
                Node temp = child;
                while (temp.next != null) {
                    temp = temp.next;
                }

                // Attach original next after child tail
                temp.next = next;
                if (next != null) {
                    next.prev = temp;
                }

                // Remove child pointer
                curr.child = null;
            }

            // Move forward only ONCE
            curr = curr.next;
        }

        return head;
    }
}
