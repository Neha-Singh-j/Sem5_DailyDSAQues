// Last updated: 8/13/2025, 12:44:22 PM
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
    public void flatten(TreeNode root) {
        MakeLL(root);

    }
    public TreeNode MakeLL(TreeNode root){
        // base case
        if(root==null){
            return null;
        }
        // single node base case
        if(root.left==null && root.right==null){
            return root;
        }

        TreeNode left_tail=MakeLL(root.left);
        TreeNode right_tail=MakeLL(root.right);
        if(root.left!=null){ // linkedlist in left existed
            left_tail.right=root.right; // head of ll2
            root.right=root.left; // making skewed 
            root.left=null; 
        }
        return right_tail != null ? right_tail : left_tail;
    }
}