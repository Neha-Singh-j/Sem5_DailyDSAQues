// Last updated: 8/1/2025, 10:42:26 PM
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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0) {return null;}
        PriorityQueue<ListNode> hp = new PriorityQueue<>(lists.length, (a,b)->(a.val-b.val));
       
         for(ListNode list:lists){
            if(list!=null) // prevent null exception
            hp.add(list);
        }
        ListNode res=new ListNode();
        ListNode p=res;
        while(!hp.isEmpty()){
            ListNode node=hp.poll();
            p.next=node;
            p=p.next;
            if(node.next!=null){hp.add(node.next);} 
        }
        return res.next;
    }
}