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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int a=check(root,(long)targetSum);
        int b=pathSum(root.left,targetSum);
        int c=pathSum(root.right,targetSum);
        return a+b+c;
    }
    public int check(TreeNode root, long sum){
        if(root==null) return 0;
        int c=0;
        if(sum-root.val==0) c++;
        c+=check(root.left,sum-root.val);
        c+=check(root.right,sum-root.val);
        return c;
    }
}