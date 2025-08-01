// Last updated: 8/1/2025, 10:31:34 PM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
            ListNode temp=head;
            ListNode dummy=new ListNode(0);
            ListNode res=dummy;
            while(temp!=null ){
                if(set.contains(temp.val)){
                    temp=temp.next;
                }else{
                    res.next=new ListNode(temp.val);
                    temp=temp.next;
                    res=res.next;
                } 
            }
        
        return dummy.next;
    }
}