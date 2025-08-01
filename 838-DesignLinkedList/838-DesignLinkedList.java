// Last updated: 8/1/2025, 10:35:32 PM
class MyLinkedList {

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        int i = 0;
        ListNode curr = head;
        while (curr != null && i < index) {
            curr = curr.next;
            i++;
        }
        return (curr != null) ? curr.val : -1;
    }

    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        head = newHead;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        ListNode curr = head;
        int i = 0;

        while (curr != null && i < index - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null) return; // Index > size

        ListNode newNode = new ListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            return;
        }

        ListNode curr = head;
        int i = 0;

        while (curr != null && i < index - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null || curr.next == null) return;

        curr.next = curr.next.next;
    }
}
