// Last updated: 8/1/2025, 10:33:26 PM
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode curr=list1;
        ListNode res=curr;
        for(int i=0;i<a-1;i++){
            res=res.next;
            temp=temp.next;
        }

          for(int i=a-1;i<=b;i++){
            temp=temp.next;
        }
         res.next=list2;
        while(res.next!=null){
            res=res.next;
        }
        res.next=temp;
    return curr;
    }
}