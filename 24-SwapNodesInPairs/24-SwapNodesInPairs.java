// Last updated: 8/1/2025, 10:42:23 PM
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
    public ListNode swapPairs(ListNode head) {

         ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Convert the linked list to an ArrayList
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        
        int len = arr.size();
        int i=1;
        while(i<arr.size()){
        int val1 = arr.get(i-1);
        int val2 = arr.get(i);
        arr.set(i-1, val2);
        arr.set(i, val1);
        i+=2;
        }
        
        
        temp = head;
        for ( i = 0; i < len; i++) {
            temp.val = arr.get(i);
            temp = temp.next;
        }
        
        return head;
    }
}

//         ListNode curr=head;
//         while(curr!=null && curr.next!=null){
//             ListNode temp=curr;
//             ListNode temp2=curr.next;
//            curr.next=curr.next.next;
//            curr=temp2;
//            curr.next=temp;
            
//         }
//         return head;
//     }
// }
 