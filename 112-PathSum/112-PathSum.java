// Last updated: 8/1/2025, 10:40:05 PM
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
       return check(root,0,targetSum);
    }
    private static boolean check(TreeNode root, int sum,int t){
        if(root==null){
            return false;
        }
        sum+=root.val;
        // if(sum==t) return true;
        if(root.left==null && root.right==null){
            return sum==t;
        }
       return check(root.left,sum,t) || check(root.right,sum,t);

        
    }
}