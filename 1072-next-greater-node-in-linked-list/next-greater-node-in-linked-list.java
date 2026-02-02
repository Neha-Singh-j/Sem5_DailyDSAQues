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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ListNode temp2=temp.next;
            boolean flag=false;
            while(temp2!=null){
                if(temp2.val>temp.val){
                    arr.add(temp2.val);
                    flag=true;
                    break;
                }
                    temp2=temp2.next;
            }
            if(!flag){
                arr.add(0);
            }
            temp=temp.next;
        }
        int n=arr.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}