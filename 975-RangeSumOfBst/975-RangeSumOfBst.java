// Last updated: 8/1/2025, 10:34:54 PM
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
    static int s=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        s=0;
         inorder(root,low,high);
        return s;
    }
    public static void inorder(TreeNode root,int l,int h){
        if(root==null) return ;

        if(root.val>=l && root.val<=h){
            s+=root.val;
        }
        inorder(root.left,l,h);
        inorder(root.right,l,h);

    }
}