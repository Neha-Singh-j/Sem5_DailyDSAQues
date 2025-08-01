// Last updated: 8/1/2025, 10:40:07 PM
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp=head;
        

       return BST(temp,null);

    }
    public static TreeNode BST( ListNode first,ListNode last ){
           if(first == last) return null;
        ListNode slow = first;
        ListNode fast = first;
        while(fast != last && fast.next != last){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val); // slow is mid value
        root.left=BST(first,slow);
        root.right=BST(slow.next,last);
        return root;
    }
}

