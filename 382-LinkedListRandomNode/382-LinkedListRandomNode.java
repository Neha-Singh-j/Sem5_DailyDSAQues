// Last updated: 8/1/2025, 10:37:27 PM
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
    private List<Integer> arr; //because we have to access range in get reandom method
    private Random r;
    public Solution(ListNode head) {
        arr=new ArrayList<>();
        r=new Random();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
    }
    
    public int getRandom() {
        int i=r.nextInt(arr.size()); // to find a integer between given range
        return arr.get(i);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */