// Last updated: 8/1/2025, 10:40:21 PM
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
    public boolean isSymmetric(TreeNode root) {
       if(root==null) return true;
        return check(root.left,root.right);
        
    }
    private static boolean check(TreeNode n1,TreeNode n2){
            if(n1==null && n2==null) return true;
            if(n1==null || n2==null) return false;
            if(n1.val!=n2.val) return false;
           return check(n1.left,n2.right) &&  check(n1.right ,n2.left);
    }
}