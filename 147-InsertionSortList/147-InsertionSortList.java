// Last updated: 8/1/2025, 10:39:32 PM
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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
         ListNode curr=head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(arr);
        ListNode res=new ListNode(0);
        ListNode dummy=res;
        int i=0;
        while(i<arr.size()){
            dummy.next=new ListNode(arr.get(i));
            dummy=dummy.next;
            i++;
        }
        return res.next;
    }
}