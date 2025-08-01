// Last updated: 8/1/2025, 10:36:29 PM
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Convert the linked list to an ArrayList
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        
        int len = arr.size();
        
        
        int val1 = arr.get(k - 1);
        int val2 = arr.get(len - k);
        
        arr.set(k - 1, val2);
        arr.set(len - k, val1);
        
        
        temp = head;
        for (int i = 0; i < len; i++) {
            temp.val = arr.get(i);
            temp = temp.next;
        }
        
        return head;
    }
}
